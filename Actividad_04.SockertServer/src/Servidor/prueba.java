package Servidor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class prueba {

	public static final int PUERTO = 2023;

	public static void main(String[] args) throws IOException {
		InputStreamReader entrada = null;
		Socket socketAlCliente = null;
		PrintStream salida = null;
		InetSocketAddress direccion = new InetSocketAddress(PUERTO);

		ServerSocket serverSocket = new ServerSocket();

		serverSocket.bind(direccion);
		int peticion = 0;
		int puntJug1 = 0;
		int puntjug2 = 0;

		while (puntJug1 < 3 || puntjug2 < 3) {

			System.out.println("SERVIDOR: Esperando peticion por el puerto " + PUERTO);
			socketAlCliente = serverSocket.accept();
			System.out.println("SERVIDOR: peticion numero " + ++peticion + " recibida");

			entrada = new InputStreamReader(socketAlCliente.getInputStream());
			BufferedReader bf = new BufferedReader(entrada);

			String stringRecibido = bf.readLine();

			System.out.println("SERVIDOR: Me ha llegado del cliente: " + stringRecibido);

			Scanner sc = new Scanner(System.in);
			String jug2 = sc.nextLine();
			String resultado;

			if (stringRecibido.equalsIgnoreCase("piedra") && jug2.equalsIgnoreCase("piedra")) {
				resultado = "empate";
				System.out.println("SERVIDOR: El calculo de los numeros es: " + resultado);
				salida = new PrintStream(socketAlCliente.getOutputStream());
				salida.println(resultado);
			}
			if (stringRecibido.equalsIgnoreCase("papel") && jug2.equalsIgnoreCase("piedra")) {
				resultado = "Gana jugador 1";
				puntJug1++;
				System.out.println("SERVIDOR: El calculo de los numeros es: " + resultado);
				salida = new PrintStream(socketAlCliente.getOutputStream());
				salida.println(resultado);
			}
			if (stringRecibido.equalsIgnoreCase("tijera") && jug2.equalsIgnoreCase("piedra")) {
				resultado = "Gana jugador 2";
				puntjug2++;
				System.out.println("SERVIDOR: El calculo de los numeros es: " + resultado);
				salida = new PrintStream(socketAlCliente.getOutputStream());
				salida.println(resultado);
			}

		}

	}
}
