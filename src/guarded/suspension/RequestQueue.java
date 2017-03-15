package guarded.suspension;

import java.util.LinkedList;

public class RequestQueue {
	@SuppressWarnings("rawtypes")
	private LinkedList queue = new LinkedList();
	
	public synchronized Request getRequest(){
		while(queue.size() == 0){
			try {
				wait();
			} catch (Exception e) {
			}
		}
		return (Request) queue.remove();
	}
	
	@SuppressWarnings("unchecked")
	public synchronized void addRequest(Request request){
		queue.add(request);
		notifyAll();
	}
}
