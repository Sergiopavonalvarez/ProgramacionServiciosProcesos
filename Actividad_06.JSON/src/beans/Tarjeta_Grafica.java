package beans;

public class Tarjeta_Grafica {
	String marca;
	String modelo;
	String precio;
	String potencia;
	
	public Tarjeta_Grafica(String marca, String modelo, String precio, String potencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
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
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	

}
