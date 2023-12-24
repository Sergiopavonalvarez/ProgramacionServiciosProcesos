package WaityNotify2;

public class Main {

	public static void main(String[] args) {
		
		Buffer a=new Buffer();
		Consumidor c1=new Consumidor("Jose", 23, a);
		Consumidor c2=new Consumidor("Pepe", 33, a);
		Consumidor c3=new Consumidor("Antonio", 63, a);
		
		
		Productor p1=new Productor("Paco", 30, a,"Paquete de Seur");
		Productor p2=new Productor("Paco", 20, a,"Paquete de correos");
		Productor p3=new Productor("Paco", 50, a,"Paquete de mierda");
		

		
		p1.start();
		p2.start();
		p3.start();
		
		c1.start();
		c2.start();
		c3.start();
		
		

	}

}
