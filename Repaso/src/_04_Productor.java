
public class _04_Productor extends Thread {

	String nombre;
	String mensaje;
	_04_Cola cola;

	public _04_Productor(String nombre, String mensaje, _04_Cola cola) {
		super();
		this.nombre = nombre;
		this.mensaje = mensaje;
		this.cola = cola;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {

			try {
				cola.darladrillo(nombre, mensaje);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
