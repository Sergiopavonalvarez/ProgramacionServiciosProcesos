package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import beans.Ordenador;
//import beans.Persona;

public class Deserializacion_JSON {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("prueba.json");
		
		try(FileReader fr = new FileReader(file);
		    BufferedReader br = new BufferedReader(fr)){
			String json = br.readLine();
			Gson gson = new Gson();
			List<Ordenador> grupoPersonas = gson.fromJson(json, new TypeToken<List<Ordenador>>(){}.getType());
			//Persona p = gson.fromJson(json, Persona.class);
			for(Ordenador p : grupoPersonas) {
				System.out.println(p);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	}


