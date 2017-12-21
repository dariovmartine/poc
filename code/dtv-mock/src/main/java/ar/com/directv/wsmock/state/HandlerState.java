package ar.com.directv.wsmock.state;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Para que la respuesta se modifique solo para el customerKey que 
// invocó a EditCustomerRequest, el valor de ID se compara contra el 
// valor de "CustomerKey" cuando se invoca a GetCustomerRequest
// Los keys deben estar en los nombres de archivos para que funcione 
// la validacion
public class HandlerState {
	
	WebService ws;
	
	List<ValueAction> actions = new ArrayList<>();
	
		
	public HandlerState(WebService ws) {
		this.ws = ws;
	}

	public void updateState(String parts[]) {
		for (Service service : ws.getServices()) {
			
			Map<String, String> map = new HashMap<>();
				
		    for (int i = 0; i < parts.length; i += 2) {
			        
		    	map.put(parts[i],parts[i + 1]);
		    }
			    
		    if (map.containsKey(service.key) 
		    		&& map.containsKey(service.name)
		    			&& map.get(service.name).equals(service.value)
	    		) {
			        	
		    	actions.remove(new ValueAction(
				    	service.action.key, 
				    	map.get(service.key), 
				    	service.name,
				    	map.get(service.name),
				    	service.action));
		    	
		    	actions.add(new ValueAction(
			    	service.action.key, 
			    	map.get(service.key), 
			    	service.name,
			    	map.get(service.name),
			    	service.action));
		    }   
		}
	}	

	public String check(String path, String xml) throws UnsupportedEncodingException {
		
		for (ValueAction valueAction : actions) {
			
			if (path.indexOf(valueAction.action.webservice) < 0)
				continue;
			
			if (path.indexOf(valueAction.action.name) < 0)
				continue;
			
			
			String fileName = path.substring(path.lastIndexOf("/")+1,path.indexOf(".xml"));
			
			String[] parts = URLDecoder.decode(fileName,"UTF-8" ).split("_");

			boolean thisIs = false;
			
			Map<String, String> map = new HashMap<>();
			
		    for (int i = 0; i < parts.length; i += 2) {
		        
		    	map.put(parts[i],parts[i + 1]);
		    }
			
		    if (map.containsKey(valueAction.keyName)
		    		&& map.get(valueAction.keyName).equals(valueAction.keyValue)
		    		) {
		    	thisIs = true;
		    }
		    
		    if (!thisIs) {
		    	continue;
		    }
			
			String tags[] = valueAction.action.xpath.split("\\.");
			int index = 0;
			int count=0;
			for (String tag : tags) {
				
				index = xml.indexOf(tag, index);
				
				if (index == -1)
					break;
				count++;
			}
			
			if (count == tags.length) {
				// |----- index   
				// V
				// id>2<
				
				String prev = xml.substring(0, index+3);
				int	next = xml.indexOf("<", index+2);
				
				String ret = prev + valueAction.action.value + xml.substring(next);
				return ret;
			}
			
		}
		
		return xml;
		
	}

	public boolean check(String path) {
		
		for (ValueAction valueAction : actions) {
			
			if (path.indexOf(valueAction.action.webservice) < 0)
				continue;
			
			if (path.indexOf(valueAction.action.name) < 0)
				continue;
			
			String fileName = path.substring(path.lastIndexOf("/")+1,path.indexOf(".xml"));
			
			String[] parts = fileName.split("_");

			boolean thisIs = false;
			
			Map<String, String> map = new HashMap<>();
			
		    for (int i = 0; i < parts.length; i += 2) {
		        
		    	map.put(parts[i],parts[i + 1]);
		    }
			
		    if (map.containsKey(valueAction.keyName)
		    		&& map.get(valueAction.keyName).equals(valueAction.keyValue)
		    		) {
		    	thisIs = true;
		    }
		    
		    if (!thisIs) {
		    	continue;
		    }
			
			return true;
		}
		
		return false;
	}

class ValueAction {
		
		public ValueAction(String keyName, String keyValue, String name, String value, Action action) {
			
			this.keyName = keyName;
			this.keyValue = keyValue;
			this.action = action;
			this.name = name;
			this.value = value;
		}
		
		String name;
		
		String value;

		String keyName;
		
		String keyValue;
		
		Action action;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((keyName == null) ? 0 : keyName.hashCode());
			result = prime * result + ((keyValue == null) ? 0 : keyValue.hashCode());
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ValueAction other = (ValueAction) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (keyName == null) {
				if (other.keyName != null)
					return false;
			} else if (!keyName.equals(other.keyName))
				return false;
			if (keyValue == null) {
				if (other.keyValue != null)
					return false;
			} else if (!keyValue.equals(other.keyValue))
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		private HandlerState getOuterType() {
			return HandlerState.this;
		}

		
		
	}

}
