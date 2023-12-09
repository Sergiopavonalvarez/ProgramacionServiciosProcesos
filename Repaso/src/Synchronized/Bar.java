package Synchronized;

public class Bar {
	
	String lugar;

	public Bar(String lugar) {
		super();
		this.lugar = lugar;
	}
	
	public synchronized void darlotodo(String nombre, int copas, int limite) throws InterruptedException {
		System.out.println(nombre+" viene a la fiesta en "+lugar);
		for (int i = copas; copas < limite; copas++) {
			Thread.sleep(500);
			System.out.println(nombre+" se toma "+copas+" copa/s ");
			
		}System.out.println(nombre+" se ha bebido "+(copas-1)+" copas y echa la pota");
		Thread.sleep(500);
		System.out.println(nombre+" se va de "+lugar);
		System.out.println();
		
	}

}
