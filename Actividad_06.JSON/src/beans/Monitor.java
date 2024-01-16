package beans;

public class Monitor {
	String nombre;
	String marca;
	String resolution;
	
	
	
	public Monitor(String nombre, String marca, String resolution) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.resolution = resolution;
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
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	@Override
	public String toString() {
		return "Monitor [nombre=" + nombre + ", marca=" + marca + ", resolution=" + resolution + "]";
	}
	
	

}
