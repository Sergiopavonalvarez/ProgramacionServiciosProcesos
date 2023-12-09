
public class _03_Fiesta {

	String lugar;
	String hora;

	public _03_Fiesta(String lugar, String hora) {
		super();
		this.lugar = lugar;
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "_03_Fiesta [lugar=" + lugar + ", hora=" + hora + "]";
	}

	public synchronized void entrar(String local, String saludo, String gilipollez, String despedida,_03_Fiesta fiesta) {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " Ha entrado en "+local+fiesta.toString())  ;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " dice " + saludo);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " dice " + gilipollez);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " dice " + despedida);

	}

}
