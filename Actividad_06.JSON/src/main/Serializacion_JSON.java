package main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

import beans.Ordenador;
import beans.Perifericos;
import beans.Raton;
import beans.Teclado;

public class Serializacion_JSON {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ordenador a=new Ordenador();
		Teclado b=new Teclado("Flaming pro eco 2", "Flamer Gaming SL");
		Raton c=new Raton("Insutating pro 1","Flamer Gaming SL");
		Perifericos d=new Perifericos(b,c);
		a.setNombre("Flameador 2024");
		a.setPrecio("1342");
		

		

		
		Gson gson=new Gson();
		String json=gson.toJson(a);
		File file=new File("prueba.json");
		
		try(FileWriter fw = new FileWriter(file)){			
			fw.write(json);
			System.out.println("Fichero creado");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println(a);
		
	
		
		

	}

}
