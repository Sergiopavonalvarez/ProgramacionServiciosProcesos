package WaityNotify2;

public class Productor extends Thread{
	
	String nombre;
	String paquete;
	int edad;
	Buffer buffer;
	public Productor(String nombre, int edad, Buffer buffer,String paquete) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.buffer = buffer;
		this.paquete=paquete;
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
				buffer.darpaquete(nombre, paquete);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
		}
	}
	

	
	

}
