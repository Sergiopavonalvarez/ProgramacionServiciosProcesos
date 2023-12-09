package WityNotify;

public class Borracho implements Runnable{
	
	String nombre;
	int limite;
	int copas=25;
	String despedida;
	Bar_cola cola;
	
	
	public Borracho(String nombre, int limite, String despedida, Bar_cola cola) {
		super();
		this.nombre = nombre;
		this.limite = limite;
		this.despedida = despedida;
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
				cola.cogercopa(nombre, despedida);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}
	
	

}
