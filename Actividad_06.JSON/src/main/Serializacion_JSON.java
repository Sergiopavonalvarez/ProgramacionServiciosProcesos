package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

import beans.Monitor;
import beans.Ordenador;
import beans.Perifericos;
import beans.Placa_Base;
import beans.Ram;
import beans.Raton;
import beans.Teclado;

public class Serializacion_JSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ordenador a=new Ordenador();
		Teclado b=new Teclado("Flaming pro eco 2", "Flamer Gaming SL");
		Raton c=new Raton("Insutating pro 1","Flamer Gaming SL");
		Perifericos d=new Perifericos(b,c);
		ArrayList<Perifericos> perifericosList = new ArrayList<>();
		Monitor e=new Monitor("4K feeder pro-max", "Rager", "2160p");
		Placa_Base f=new Placa_Base("B470", "Rager", "2160P");
		Ram g=new Ram("1", "Flaming", "DDR", "8GB");
		Ram h=new Ram("1", "Flaming", "DDR", "8GB");
		ArrayList<Ram>ramlist=new ArrayList<>();
		ramlist.add(h);
		ramlist.add(g);
		
		
		perifericosList.add(d);

		

		

		
		
		
		
		a.setNombre("Flameador 2024");
		a.setPrecio("1342");
		a.setPerifericos(perifericosList);

		

		
		
		
		
		
		
		
		
		
		

		
		Gson gson=new Gson();
		String json=gson.toJson(a);
		File file=new File("prueba.json");
		
		try(FileWriter fw = new FileWriter(file)){			
			fw.write(json);
			System.out.println("Fichero creado");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		System.out.println(a);
		
	
		
		

	}

}
