package ar.com.directv.wsmock.controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.ParserConfigurationException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.xml.sax.SAXException;

import com.fasterxml.jackson.databind.ObjectMapper;

import ar.com.directv.wsmock.state.HandlerState;
import ar.com.directv.wsmock.state.WebService;


@Controller
public class BaseController {
	
	Logger logger = LoggerFactory.getLogger(BaseController.class);

	
	private static final String MOCKS = "mocks";
	private static final String XML_EXTENSION = ".xml";
				
	private Map<String, String> fileMap = new HashMap<String, String>();
	
	private HandlerState handlerState;
	
	@PostConstruct
	public void postConstruct() throws Exception {
		
		Path path = Paths.get(getClass().getClassLoader()
			      .getResource("state.json").toURI());
			          
	    StringBuilder data = new StringBuilder();
	    Stream<String> lines = Files.lines(path);
		lines.forEach(line -> data.append(line).append("\n"));
		lines.close();
			    
		String xml = data.toString();
		
		ObjectMapper mapper = new ObjectMapper();
		
		handlerState = new HandlerState(mapper.readValue(xml, WebService.class));
		
	}

	@RequestMapping("/{wsName}")
	public @ResponseBody String process(@PathVariable String wsName, @RequestBody String request, HttpServletResponse response) throws IOException, ParserConfigurationException, SAXException, InterruptedException {
		String absolutePath = 
			this.getMockResponseFilePath(wsName, 
				request
				// saco los espacios y saltos de linea entre anchors para poder matchear
				.replaceAll(">[\t|\n|\r|\b|\\s]*<", "><")
				// saco todos los saltos de linea para poder matchear
				.replaceAll("[\t|\n|\r]*", "")
			);
		
		String fileResponse = getResponse(absolutePath);
		
//		if(isSOAPFault(fileResponse)){
//			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR); 
//		}
		
		Thread.sleep(1000);
		return fileResponse;
	}		
	
//	private boolean isSOAPFault(String response) {
//		Pattern pattern = Pattern.compile(SOAP_FAULT);
//		Matcher matcher = pattern.matcher(response);
//	    return matcher.find();
//	}

	@RequestMapping("/")
	public @ResponseBody String index(){
		return "DirecTV SOAP WS Mock!";
	}
	
	public StringBuffer trimFile(File file) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(file));
		StringBuffer result = new StringBuffer();
		String line;
		while ((line = reader.readLine()) != null){
			result.append(line);
		}
		reader.close();
		return result;
	}
	
	private String getMockResponseFilePath(String wsName, String xml) throws IOException{
		
		String base = this.getClass().getClassLoader().getResource("").getPath() + MOCKS + File.separator + wsName ;
		String wsMethodName = this.getWSMethodName(base, xml);
		String finalPath = base + File.separator+ wsMethodName + File.separator; 
		return finalPath + getFileName(finalPath, xml);	
	}
		
	private String getWSMethodName(String base, String xml) {
		for (final File fileEntry : new File(base).listFiles()) 
			if (fileEntry.isDirectory() && xml.contains(fileEntry.getName()))
				return fileEntry.getName();
		throw new RuntimeException("Method not found"); 
	}
	
	private String getFileName(String base, String xml) throws UnsupportedEncodingException {
		
		String nameSpace =  "([a-zA-Z0-9]+:)*";
		
		for (final File fileEntry : new File(base).listFiles(new FilenameFilter() {
		    public boolean accept(File dir, String name) {
		        return name.toLowerCase().endsWith(XML_EXTENSION);
		    }
		})) { 
			String fileName = fileEntry.getName();
					
			fileName = fileName.substring(0,fileName.indexOf(XML_EXTENSION));
			
			String[] parts = URLDecoder.decode(fileName,"UTF-8" ).split("_");

			boolean thisIsTheFile = true;
		    for (int i = 0; i < parts.length; i += 2) {
		        
		    	String tag = parts[i];
		        		
		        String value = parts[i + 1];
		        String regex = "(.)*<" + nameSpace + tag + ">"+value+"</" + nameSpace  +  tag + ">(.)*";
		        boolean res = xml.matches(regex);
		        thisIsTheFile &= res;
		        logger.debug("Busco: {} en {}  resultado : {} ", regex , xml, res);
		    }
		    
		    if (thisIsTheFile) {
		    	handlerState.updateState(parts);
				return fileEntry.getName();
		    }
		}
		
		throw new RuntimeException("Xml with parameters not found"); 
	}	
		
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody String handle(final Exception ex) {
		return "";	
	}
	
	synchronized private String getResponse(String absolutePath) throws IOException {
		
		if(fileMap.containsKey(absolutePath) && ! handlerState.check(absolutePath)) {
			return fileMap.get(absolutePath);
		}

		StringBuffer xmlFile = this.trimFile(new File(absolutePath));
		String fileResponse = xmlFile.toString();
		
		fileResponse = handlerState.check(absolutePath, fileResponse);
		
		fileMap.put(absolutePath, fileResponse);

		return fileResponse;
	}
	
	public static void main(String[] args) throws IOException {
		
		//String xml = new String(Files.readAllBytes(Paths.get("/home/victormartinez/directv/branchs/afe/dev/dtv-mock/src/main/resources/alog.xml")));
		
		//xml = xml.replaceAll(">[\t|\n|\r|\b|\\s]*<", "><").replaceAll("[\t|\n|\r]*", "");
		
		//String regex = "(.)*<([a-zA-Z0-9]+:)*description>ADHESION / SDSNUEVO</([a-zA-Z0-9]+:)*description>(.)*";
		
		//System.out.println(xml.matches(regex));
		
		String xml = "(.)*<([a-zA-Z0-9]+:)*description>SOLICITUD DE ADHESION PENDIENTE DE CONFIRMACION /SDS</([a-zA-Z0-9]+:)*description>(.)*";
		
		String regex = "SOLICITUD DE ADHESION PENDIENTE DE CONFIRMACION /SDS";
		
		System.out.println(xml.matches(regex)); return;
		
		
	}
}
