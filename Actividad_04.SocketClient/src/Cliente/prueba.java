package Cliente;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class prueba {

	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "10.34.125.135";

	public static void main(String[] args) {
		System.out.println("        APLICACI N CLIENTE         ");
		System.out.println("-----------------------------------");

		InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);

		try (Scanner sc = new Scanner(System.in); Socket socketAlServidor = new Socket()) {

			System.out.println("CLIENTE: Introduzca PIEDRA | PAPEL | TIJERA");
			String mano = sc.nextLine();

			System.out.println("CLIENTE: Esperando a que el servidor acepte la conexi n");
			socketAlServidor.connect(direccionServidor);
			System.out.println("CLIENTE: Conexion establecida... a " + IP_SERVER + " por el puerto " + PUERTO);

			PrintStream salida = new PrintStream(socketAlServidor.getOutputStream());

			InputStreamReader entrada = new InputStreamReader(socketAlServidor.getInputStream());

			BufferedReader bf = new BufferedReader(entrada);

			System.out.println("CLIENTE: Esperando al resultado del servidor...");

			String resultado = bf.readLine();

			System.out.println("CLIENTE: El resultado de la suma es: " + resultado);

		} catch (UnknownHostException e) {
			System.err.println("CLIENTE: No encuentro el servidor en la dirección" + IP_SERVER);
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("CLIENTE: Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("CLIENTE: Error -> " + e);
			e.printStackTrace();
		}

		System.out.println("CLIENTE: Fin del programa");
	}

}
