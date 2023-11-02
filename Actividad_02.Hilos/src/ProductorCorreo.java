import java.util.ArrayList;

public class ProductorCorreo extends Thread {

	public String nombre;
	public Buffer buffer;
	public ArrayList<Correo> listaCorreo = new ArrayList<Correo>();

	public ProductorCorreo(String nombre, Buffer buffer) {
		super();
		this.nombre = nombre;
		this.buffer = buffer;

	}

	public void addCorreo(Correo correo) {
		listaCorreo.add(correo);

	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);

				System.out.println(nombre + " ha enviado un correo " + listaCorreo.get(i).getId());

				buffer.addMensaje(listaCorreo.get(i));

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
