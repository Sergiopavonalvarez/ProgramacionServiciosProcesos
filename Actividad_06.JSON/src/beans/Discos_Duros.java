package beans;

public class Discos_Duros {
	String id;
	String marca;
	String tipo;
	String capacidad;
	
	
	public Discos_Duros(String id, String marca, String tipo, String capacidad) {
		super();
		this.id = id;
		this.marca = marca;
		this.tipo = tipo;
		this.capacidad = capacidad;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	
	

}