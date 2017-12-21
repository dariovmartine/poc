package ar.com.directv.wsmock.state;

import java.util.ArrayList;
import java.util.List;

public class WebService {
	
	String webservice;
	
	List<Service> services = new ArrayList<>();

	public String getWebservice() {
		return webservice;
	}

	public void setWebservice(String webservice) {
		this.webservice = webservice;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	

}
