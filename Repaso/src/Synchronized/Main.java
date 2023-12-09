package Synchronized;

public class Main {

	public static void main(String[] args) {
		Bar b1 = new Bar("Carabanchel");
		Invitado a1 = new Invitado("Daniel",1,9,b1);
		Invitado a2 = new Invitado("Bonash",1,2,b1);
		Invitado a3 = new Invitado("Pedro",1,3,b1);
		Invitado a4 = new Invitado("Sergio",1,1,b1);
		
		Thread c1= new Thread(a1);
		Thread c2= new Thread(a2);
		Thread c3= new Thread(a3);
		Thread c4= new Thread(a4);
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();

	}

}
