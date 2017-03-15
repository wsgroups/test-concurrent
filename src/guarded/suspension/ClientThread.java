package guarded.suspension;

import java.util.ArrayList;
import java.util.List;

import com.future.FutureData;

public class ClientThread extends Thread{
	private RequestQueue requestQueue;
	private List<Request> myRequest = new ArrayList<Request>();
	
	public ClientThread(RequestQueue requestQueue,String name) {
		super(name);
		this.requestQueue = requestQueue;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			Request request = new Request("RequestID:" + i + "Thread_Name : "
					+ Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getName() + "requests" + request);
			
			request.setResponse(new FutureData());
			requestQueue.addRequest(request);
			myRequest.add(request);
		}
	}
	
}
