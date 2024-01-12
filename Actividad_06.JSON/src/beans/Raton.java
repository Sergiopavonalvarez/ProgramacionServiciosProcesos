package beans;

public class Raton {
	String nombre;
	String marca;
	public Raton(String nombre, String marca) {
		super();
		this.nombre = nombre;
		this.marca = marca;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Raton [nombre=" + nombre + ", marca=" + marca + "]";
	}
	
	
	
	

}
