package servidor;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {
	
	public static final int PUERTO = 2023;
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("      APLICACI�N DE SERVIDOR      ");
		System.out.println("----------------------------------");
		

		InputStreamReader entrada = null;
		//Salida de datos. Es el canal de salida del servidor, es decir, el canal por 
		//el cual vamos a enviar informaci�n al cliente.
		PrintStream salida = null;
		
		//Notese como ahora:
		//1. El PrintStream del cliente es el InputStreamReader del servidor
		//2. El PrintStream del servidor es el InputStreamReader del cliente
		
		//Socket -> es la clase que nos va a permitir comunicarnos con el cliente,
		//en este caso no lo crearemos nosotros, sino que sera el SocketServer quien
		//lo cree cuando acepte una peticion de un cliente.
		Socket socketAlCliente = null;
		
		InetSocketAddress direccion = new InetSocketAddress(PUERTO);
		
		//En este caso no podemos hacer la declaracion try-with-resources como antes
		//ya que el servidor es un hilo que no para nunca y por cada peticion
		//crea un nuevo objeto Socket a partir del objeto ServerSocket, es decir,
		//sera el objeto ServerSocket el que nos crerara el objeto Socket por nosostros
		try (ServerSocket serverSocket = new ServerSocket()){			
			
			//Decimos al server socket que escuche peticiones desde el puerto
			//que hayamos establecido
			serverSocket.bind(direccion);
			
			//Vamos a llevar la cuenta del numero de peticiones que nos llegan
			int peticion = 0;
			
			//Estamos continuamente escuchando, es lo normal dentro del comportamiento
			//de un servidor, un programa que no para nunca
			
			while(true){		
				
				System.out.println("SERVIDOR: Esperando peticion por el puerto " + PUERTO);
				socketAlCliente = serverSocket.accept();
				System.out.println("SERVIDOR: peticion numero " + ++peticion + " recibida");
				entrada = new InputStreamReader(socketAlCliente.getInputStream());
				BufferedReader bf = new BufferedReader(entrada);					
				String stringRecibido = bf.readLine();
				System.out.println("SERVIDOR: Me ha llegado del cliente: " + stringRecibido);
				//Como sabemos que el cliente nos envia un 3-7, hacemos un split por "-"
				//para obtener la información.
				String[] operadores = stringRecibido.split("-");
				int iNumero0 = Integer.parseInt(operadores[0]);//3
				int iNumero1 = Integer.parseInt(operadores[1]);//4
				int iNumero2=Integer.parseInt(operadores[2]);
				
				//Hay que tener en cuenta que es posible que los servidores tarden en responder
				//Thread.sleep(15000);
				
				//Es en este momento cuando calculamos la suma
				//int resultado = iNumero1 + iNumero2;//7 
				int resultado=0;
				switch(iNumero0) {
				
				case 1:
					resultado=iNumero1+iNumero2;
					break;
					
				case 2: 
					resultado=iNumero1-iNumero2;
					break;
				
				case 3:
					resultado=iNumero1*iNumero2;
					break;
				case 4:
					resultado=iNumero1/iNumero2;
					break;
				case 5:
					socketAlCliente.close();

					break;
					
				}
				
				
				
				System.out.println("SERVIDOR: El calculo de los numeros es: " + resultado);
								

				salida = new PrintStream(socketAlCliente.getOutputStream());
				salida.println(resultado);	
				

			}
		} catch (IOException e) {
			System.err.println("SERVIDOR: Error de entrada/salida");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("SERVIDOR: Error -> " + e);
			e.printStackTrace();
		}
	}//FIN DEL PROGRAMA
}
