import java.util.LinkedList;
import java.util.Queue;

public class _04_Cola {

	int MAX_ELEMENTOS = 3;
	private Queue<String> cola = new LinkedList<>();

	public synchronized void darladrillo(String nombre, String mensaje) throws InterruptedException {
		if (cola.size() == MAX_ELEMENTOS) {
			wait();

		} else {
			cola.offer(nombre);
			System.out.println(nombre + " " + mensaje);
			notify();
		}

	}

	public synchronized void recogerladrillo(String nombre, String mensaje) throws InterruptedException {

		if (cola.size() == 0) {
			wait();
		} else {
			cola.poll();
			System.out.println(nombre + " dice " + mensaje);
			notify();
		}

	}

}
