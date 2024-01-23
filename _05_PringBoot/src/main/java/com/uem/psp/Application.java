package com.uem.psp;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.uem.psp.entidad.Cliente;
import com.uem.psp.entidad.Persona;
import com.uem.psp.persistencia.PersonaDao;

//Esta anotación hace dos cosas:
//1 Busca dentro de este paquete y de sus subpaquete
//anotaciones Spring para gestionarlas
//2 
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		// Esto arranca el contexto de Spring y carga los
		// objetos que hayamos dado de alta
		// SpringApplication.run(Application.class, args);

		ApplicationContext context = SpringApplication.run(Application.class, args);
		Persona p1 = new Persona();
		Persona p2 = (Persona) context.getBean("persona");
		p2.setNombre("Manuel");
		Persona p3 = context.getBean("persona", Persona.class);
		System.out.println(p3.getNombre());
		p3 = context.getBean("persona2", Persona.class);
		System.out.println(p3.getNombre());
		p3 = context.getBean("persona3", Persona.class);
		System.out.println(p3.getNombre());
		p1 = null;
		// p2 = null;
		p3 = null;

		Cliente c1 = context.getBean("cliente", Cliente.class);
		System.out.println(c1.getEntidadBancaria().getNumeroCuenta());

		PersonaDao pDao = context.getBean("personaDao", PersonaDao.class);

		pDao.save(p2);

		Optional<Persona> op = pDao.findById(1);
		if (op.isPresent()) {
			System.out.println(op.get());
		}

	}

	@Bean
	public Persona persona2() {
		Persona p = new Persona();
		p.setNombre("El Bicho");
		return p;
	}

	@Bean
	public Persona persona3() {
		Persona p = new Persona();
		p.setNombre("Pepito");
		return p;
	}

}
