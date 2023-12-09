
public class _03_FiestaRunnable implements Runnable {

	String local;
	String saludo;
	String despedida;
	String gilipollez;
	_03_Fiesta fiesta;

	public _03_FiestaRunnable(String local, String saludo, String despedida, String gilipollez, _03_Fiesta fiesta) {
		super();
		this.local = local;
		this.saludo = saludo;
		this.despedida = despedida;
		this.gilipollez = gilipollez;
		this.fiesta = fiesta;
	}

	@Override
	public void run() {
		
		fiesta.entrar(local,saludo,gilipollez,despedida,fiesta);

	}

}
