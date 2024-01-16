package beans;

import java.util.ArrayList;
import java.util.Arrays;

public class Ordenador {
	
	private String nombre;
	private String precio;
	private ArrayList <Perifericos> perifericos;
	private ArrayList <Componentes> componentes;
	
	
	
	public Ordenador() {
		
	}
	
	public Ordenador(String nombre, String precio, ArrayList<Perifericos> perifericos, ArrayList<Componentes> componentes) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.perifericos = perifericos;
		this.componentes = componentes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public ArrayList<Perifericos> getPerifericos() {
		return perifericos;
	}

	public void setPerifericos(ArrayList<Perifericos> perifericos) {
		this.perifericos = perifericos;
	}

	public ArrayList<Componentes> getComponentes() {
		return componentes;
	}

	public void setComponentes(ArrayList<Componentes> componentes) {
		this.componentes = componentes;
	}

	@Override
	public String toString() {
		return "Ordenador [nombre=" + nombre + ", precio=" + precio + ", componentes=" + componentes + ", perifericos="
				+ perifericos + "]";
	}
	
	


	
	


	


	
	


	
	
	
	
	
	
	
	
	

}
