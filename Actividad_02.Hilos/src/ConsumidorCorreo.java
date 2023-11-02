
public class ConsumidorCorreo extends Thread {

	public String nombre;
	public Buffer buffer;

	public ConsumidorCorreo(String nombre, Buffer buffer) {
		super();
		this.nombre = nombre;
		this.buffer = buffer;
	}

	public void run() {

		while (true) {
			Correo mensaje = buffer.getMensaje();
			System.out.println(nombre + " ha recogido el mensaje " + mensaje.toString());
		}
	}

}
