package Servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	public static final int PUERTO = 2023;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.out.println("      APLICACI�N DE SERVIDOR      ");
		System.out.println("----------------------------------");
		InputStreamReader entrada = null;
		PrintStream salida = null;
		Socket socketAlCliente = null;
		InetSocketAddress direccion = new InetSocketAddress(PUERTO);
		ServerSocket serverSocket = new ServerSocket();
		serverSocket.bind(direccion);

		int peticion = 0;
		System.out.println("SERVIDOR: Esperando peticion por el puerto " + PUERTO);
		socketAlCliente = serverSocket.accept();
		System.out.println("SERVIDOR: peticion numero " + ++peticion + " recibida");
		entrada = new InputStreamReader(socketAlCliente.getInputStream());

		String piedra = "piedra";
		String papel = "papel";
		String tijera = "tijera";
		int resultadocliente = 0;
		int resultadoservidor = 0;

		while (true) {

			BufferedReader bf = new BufferedReader(entrada);
			String manocliente = bf.readLine();

			System.out.println("Introduce piedra papel o tijera");
			Scanner sc = new Scanner(System.in);
			String manoservidor = sc.nextLine();

			switch (manocliente) {

			case "piedra":
				if (manoservidor.equalsIgnoreCase(tijera)) {
					resultadoservidor = +1;
				}
				if (manoservidor.equalsIgnoreCase(papel)) {
					resultadocliente = +1;
				}
				if (manoservidor.equalsIgnoreCase(piedra)) {

				}
			case "papel":
				if (manoservidor.equalsIgnoreCase(tijera)) {
					resultadocliente = +1;
				}
				if (manoservidor.equalsIgnoreCase(papel)) {

				}
				if (manoservidor.equalsIgnoreCase(piedra)) {
					resultadoservidor = +1;

				}
			case "tijera":
				if (manoservidor.equalsIgnoreCase(tijera)) {

				}
				if (manoservidor.equalsIgnoreCase(papel)) {
					resultadocliente = +1;
				}
				if (manoservidor.equalsIgnoreCase(piedra)) {
					resultadoservidor = +1;
				}
			}
			salida = new PrintStream(socketAlCliente.getOutputStream());
			salida.println("Cliente: " + resultadocliente + "-" + "Servidor: " + resultadoservidor);

		}
		// socketAlCliente.close();

	}
}
