package beans;

public class Procesador {
	String marca;
	String modelo;
	String velocidad;
	
	public Procesador(String marca, String modelo, String velocidad) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.velocidad = velocidad;
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
	public String getVelocidad() {
		return velocidad;
	}
	public void setVelocidad(String velocidad) {
		this.velocidad = velocidad;
	}
	@Override
	public String toString() {
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", velocidad=" + velocidad + "]";
	}
	
	

}
