package WityNotify;

import java.util.LinkedList;
import java.util.Queue;

public class Bar_cola {
	
	int MAX_ELEMENT=5;
	private Queue<String> cola = new LinkedList<>();
	
	public synchronized void darcopa(String nombre,String copa) throws InterruptedException {
		if(cola.size()==MAX_ELEMENT) {
			wait();
		}else {
			System.out.println("Aqui tienes un "+copa);
			cola.offer(copa);
			notify();
		}
		
	}
	
	public synchronized void cogercopa(String nombre,String saludo) throws InterruptedException {
		if(cola.size()==0) {
			wait();
		}else {
			
			cola.poll();
			System.out.println(saludo);
			notify();
		}
	}
	
	

}
