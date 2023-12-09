
public class _04_Main {

	public static void main(String[] args) {
		_04_Cola cola = new _04_Cola();
		_04_Productor p1 = new _04_Productor("Jose", "deja gustosamente un ladrillo", cola);
		_04_Productor p2 = new _04_Productor("Pepe", "deja de mala leche un ladrillo", cola);

		_04_Consumidor c1 = new _04_Consumidor("Antonio", "listo", cola);
		_04_Consumidor c2 = new _04_Consumidor("Miguel", "listo", cola);

		p1.start();
		p2.start();
		c1.start();
		c2.start();

	}

}
