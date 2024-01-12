package beans;

public class Teclado {
	
	String nombre;
	String marca;
	
	
	
	public Teclado(String nombre, String marca) {
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
	
	

}
