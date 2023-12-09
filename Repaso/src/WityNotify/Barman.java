package WityNotify;

public class Barman implements Runnable{
	
	String nombre;
	String copa;
	Bar_cola cola;
	int copas=25;
	
	
	

	public Barman(String nombre, String copa, Bar_cola cola) {
		super();
		this.nombre = nombre;
		this.copa = copa;
		this.cola = cola;
	}




	@Override
	public void run() {
		
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				cola.darcopa(nombre, copa);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}
	
	

}
