
public class _03_Main {

	public static void main(String[] args) {
		_03_Fiesta g = new _03_Fiesta("Madrid", "15 AM");
		_03_FiestaRunnable a = new _03_FiestaRunnable("Sala Heinneken", "Hola payaso", "Adios payaso",
				"Suelto una payasada", g);
		Thread a1 = new Thread(a);
		a1.setName("Jose");

		_03_Fiesta l = new _03_Fiesta("Madrid", "15 AM");
		_03_FiestaRunnable s = new _03_FiestaRunnable("Sala Heinneken", "Hola memo", "Adios memo", "Suelto una memez",
				g);
		Thread s1 = new Thread(s);
		s1.setName("Manuel");

		s1.start();
		a1.start();

	}

}
