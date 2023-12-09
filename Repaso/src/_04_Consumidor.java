
public class _04_Consumidor extends Thread {
	String nombre;
	String mensaje;
	_04_Cola cola;

	public _04_Consumidor(String nombre, String mensaje, _04_Cola cola) {
		super();
		this.nombre = nombre;
		this.mensaje = mensaje;
		this.cola = cola;
	}

	public synchronized void run() {

		for (int i = 0; i < 10; i++) {

			try {
				cola.recogerladrillo(nombre, mensaje);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
