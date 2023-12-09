
public class _01_Main {

	public static void main(String[] args) {
		
		_01_Thread a=new _01_Thread("Hola");
		a.setName("Pepe");
		_01_Thread b=new _01_Thread("Adios");
		b.setName("Jose");
		
		a.start();
		b.start();
		

	}

}
