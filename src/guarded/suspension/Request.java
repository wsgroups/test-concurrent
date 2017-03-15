package guarded.suspension;

import com.future.Data;

public class Request {
	
	private String name;
	private Data response;
	
	
	public synchronized Data getResponse() {
		return response;
	}

	public synchronized void setResponse(Data response) {
		this.response = response;
	}

	public String getName() {
		return name;
	}

	public Request(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Request [name=" + name + "]";
	}
	
}
