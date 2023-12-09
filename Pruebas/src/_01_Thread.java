
public class _01_Thread extends Thread{
	
	String saludo;

	public _01_Thread(String saludo) {
		super();
		this.saludo = saludo;
	}
	
	public void run() {
		
		
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" dice "+i);
			
		}
		System.out.println(Thread.currentThread().getName()+" ha termindado y dice: "+saludo);
		
		
		
	}
	


}
