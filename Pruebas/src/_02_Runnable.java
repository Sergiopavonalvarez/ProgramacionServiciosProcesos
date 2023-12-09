
public class _02_Runnable implements Runnable {

	String saludo;

	public _02_Runnable(String saludo) {
		super();
		this.saludo = saludo;
	}



	@Override
	public void run() {
		for (int j = 0; j < 10; j++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" dice "+j);
		}
		System.out.println(Thread.currentThread().getName()+" ha terminado y dice: "+saludo);

	}

}
