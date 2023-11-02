import java.sql.Date;
import java.util.Scanner;

public class ejercicio01_main {

	public static void main(String[] args) throws InterruptedException {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un numero: ");
		long numeroa = sc.nextLong();
		ejercicio01 hilo1 = new ejercicio01(numeroa);
		hilo1.setName("Hilo 1");

		System.out.println("Introduce un numero: ");
		long numerob = sc.nextLong();
		ejercicio01 hilo2 = new ejercicio01(numerob);
		hilo2.setName("Hilo 2");

		System.out.println("Introduce un numero: ");
		long numeroc = sc.nextLong();
		ejercicio01 hilo3 = new ejercicio01(numeroc);
		hilo3.setName("Hilo 3");

		hilo1.start();

		hilo2.start();

		hilo3.start();

	}

}
