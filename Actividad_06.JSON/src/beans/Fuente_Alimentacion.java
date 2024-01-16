package beans;

import java.util.Arrays;

public class Fuente_Alimentacion {
	String marca;
	String modelo;
	String [] potencia;
	
	public Fuente_Alimentacion(String marca, String modelo, String[] potencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.potencia = potencia;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String[] getPotencia() {
		return potencia;
	}
	public void setPotencia(String[] potencia) {
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		return "Fuente_Alimentacion [marca=" + marca + ", modelo=" + modelo + ", potencia=" + Arrays.toString(potencia)
				+ "]";
	}
	
	

}
