package beans;

import java.util.HashMap;

public class Perifericos {

	Teclado teclado;
	Raton raton;

	public Perifericos(Teclado teclado, Raton raton) {
		super();
		this.teclado = teclado;
		this.raton = raton;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public Raton getRaton() {
		return raton;
	}

	public void setRaton(Raton raton) {
		this.raton = raton;
	}

	@Override
	public String toString() {
		return "Perifericos [teclado=" + teclado + ", raton=" + raton + "]";
	}

}
