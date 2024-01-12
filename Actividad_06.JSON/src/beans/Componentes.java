package beans;

import java.util.ArrayList;
import java.util.Arrays;

public class Componentes {
	Monitor monitor;
	Placa_Base placa_base;
	ArrayList <Ram> [] ram;
	Procesador procesador;
	ArrayList <Discos_Duros> discos_duros;
	Fuente_Alimentacion fuente_alimentacion;
	Tarjeta_Grafica tarjeta_grafica;
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Placa_Base getPlaca_base() {
		return placa_base;
	}
	public void setPlaca_base(Placa_Base placa_base) {
		this.placa_base = placa_base;
	}
	public ArrayList<Ram>[] getRam() {
		return ram;
	}
	public void setRam(ArrayList<Ram>[] ram) {
		this.ram = ram;
	}
	public Procesador getProcesador() {
		return procesador;
	}
	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}
	public ArrayList<Discos_Duros> getDiscos_duros() {
		return discos_duros;
	}
	public void setDiscos_duros(ArrayList<Discos_Duros> discos_duros) {
		this.discos_duros = discos_duros;
	}
	public Fuente_Alimentacion getFuente_alimentacion() {
		return fuente_alimentacion;
	}
	public void setFuente_alimentacion(Fuente_Alimentacion fuente_alimentacion) {
		this.fuente_alimentacion = fuente_alimentacion;
	}
	public Tarjeta_Grafica getTarjeta_grafica() {
		return tarjeta_grafica;
	}
	public void setTarjeta_grafica(Tarjeta_Grafica tarjeta_grafica) {
		this.tarjeta_grafica = tarjeta_grafica;
	}
	@Override
	public String toString() {
		return "Componentes [monitor=" + monitor + ", placa_base=" + placa_base + ", ram=" + Arrays.toString(ram)
				+ ", procesador=" + procesador + ", discos_duros=" + discos_duros + ", fuente_alimentacion="
				+ fuente_alimentacion + ", tarjeta_grafica=" + tarjeta_grafica + "]";
	}
	
	
	
	

}
