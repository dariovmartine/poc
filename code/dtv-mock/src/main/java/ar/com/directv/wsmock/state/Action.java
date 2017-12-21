package ar.com.directv.wsmock.state;

public class Action {
	
	String webservice;
	String name;
	String xpath;
	String value;
	String key;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getWebservice() {
		return webservice;
	}
	public void setWebservice(String webservice) {
		this.webservice = webservice;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getxpath() {
		return xpath;
	}
	public void setxpath(String xpath) {
		this.xpath = xpath;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	

}
