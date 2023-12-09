package WityNotify;

public class Main {

	public static void main(String[] args) {
		Bar_cola b=new Bar_cola();
		Barman b1=new Barman("Bonash","Whisky",b);
		Barman b2=new Barman("Gonza","Ron",b);
		Barman b3=new Barman("Tutas","Vodka",b);
		
		Borracho a1=new Borracho("Sergio", 1, "Que te den!", b);
		Borracho a2=new Borracho("Miguel", 2, "Yepe Ka Yihe!", b);
		Borracho a3=new Borracho("Daniel", 3, "Dohh patatahh!", b);
		Borracho a4=new Borracho("Pedro", 2, "Pero... quien eres?", b);
		Borracho a5=new Borracho("Prieto", 1, "Es bien!", b);
		
		Thread t1=new Thread(b1);
		Thread t2=new Thread(b2);
		Thread t3=new Thread(b3);
		Thread t4=new Thread(a1);
		Thread t5=new Thread(a2);
		Thread t6=new Thread(a3);
		Thread t7=new Thread(a4);
		Thread t8=new Thread(a5);
		
		t1.start();
		t2.start();
		t3.start();
//		t4.start();
//		t5.start();
		t6.start();
		t7.start();
		t8.start();

	}

}
