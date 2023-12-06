import java.util.Iterator;

public class ejercicio01 extends Thread {

	private long numeroprimo;
	private long resultado;

	public ejercicio01(long numeroprimo) {
		super();
		this.numeroprimo = numeroprimo;
	}

	public void run() {

		long inicio = System.currentTimeMillis();

		if (esPrimo(numeroprimo)) {

			System.out.println("Arrancando hilo: " + Thread.currentThread().getName() + " ----> el " + numeroprimo
					+ " es un número primo");
			long fin1 = System.currentTimeMillis();
			long resultado = fin1 - inicio;
			System.out.println(
					"El hilo " + Thread.currentThread().getName() + " ha tardado " + resultado + " milisegundos");

		} else {

			System.out.println("Arrancando hilo: " + Thread.currentThread().getName() + " ----> el " + numeroprimo
					+ " no es un número primo. ");

			long fin1 = System.currentTimeMillis();
			long resultado = fin1 - inicio;
			System.out.println(
					"El hilo " + Thread.currentThread().getName() + " ha tardado " + resultado + " milisegundos");

		}

	}

	public static boolean esPrimo(long numero) {

		if (numero <= 1) {
			return false;
		}
		if (numero <= 3) {
			return true;
		}
		if (numero % 2 == 0 || numero % 3 == 0) {
			return false;
		}

		for (int i = 5; i * i <= numero; i += 6) {
			if (numero % i == 0 || numero % (i + 2) == 0) {
				return false;
			}
		}

		return true;
	}
}
