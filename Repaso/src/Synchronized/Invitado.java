package Synchronized;

public class Invitado implements Runnable{
	
	String nombre;
	int copas;
	int limite;
	Bar bar;
	
	

	public Invitado(String nombre, int copas, int limite, Bar bar) {
		super();
		this.nombre = nombre;
		this.copas = copas;
		this.limite = limite;
		this.bar = bar;
	}



	@Override
	public void run() {
		try {
			bar.darlotodo(nombre, copas, limite);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
