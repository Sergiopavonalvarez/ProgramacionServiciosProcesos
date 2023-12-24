package WaityNotify2;

import java.util.LinkedList;
import java.util.Queue;

public class Consumidor extends Thread{
	
	String nombre;

	int edad;
	Buffer buffer;
	
	

	
	
	public Consumidor(String nombre, int edad, Buffer buffer) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.buffer = buffer;

	}





	public void run() {
		for (int i = 0; i < 3; i++) {
			

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				buffer.recogerpaquete(nombre);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
	}
	
	
	

	

}
