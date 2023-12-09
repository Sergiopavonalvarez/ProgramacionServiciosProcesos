
public class _02_Main {

	public static void main(String[] args) {
		_02_Runnable a=new _02_Runnable("Hola");
		Thread b=new Thread(a);
		b.setName("Jose");
		_02_Runnable c=new _02_Runnable("Adios");
		Thread d=new Thread(c);
		d.setName("Pepe");
		d.start();
		b.start();

	}

}
