package WaityNotify2;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
	
	int MAX_ELEMENTS=3;

	private Queue<String> cola = new LinkedList<>();
	
	public synchronized void darpaquete(String nombre,String paquete) throws InterruptedException {
		
		if (cola.size()==MAX_ELEMENTS){
			wait();
			
		}else {
			System.out.println(nombre+" se agacha para dejar el "+paquete);
			cola.offer(paquete);
			notify();
			
		}	
		
	}
	
	public synchronized void recogerpaquete(String nombre) throws InterruptedException {
		
		if(cola.size()==0) {
			wait();
			
			
		}else {
			System.out.println(nombre+ " se agacha para recoger "+cola.element());
			cola.poll();
			notify();
		}
		
		
		
	}
	

	
	
	
	

}
