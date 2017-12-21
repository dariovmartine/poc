package ar.com.directv.wsmock.state;

public class Service {
	
	String wsname;
	
	public String getWsname() {
		return wsname;
	}

	public void setWsname(String wsname) {
		this.wsname = wsname;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	String name;
	
	String value;
	
	String xpath;
	
	String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	Action action;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getXpath() {
		return xpath;
	}

	public void setXpath(String xpath) {
		this.xpath = xpath;
	}

	public Action getAction() {
		return action;
	}

	public void setAction(Action action) {
		this.action = action;
	}

}
