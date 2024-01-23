package com.uem.psp.entidad.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;

@Component

public class Cliente {
	private int id;
	private String dni;
	@Autowired
	private EntidadBancaria EntidadBancaria;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public EntidadBancaria getEntidadBancaria() {
		return EntidadBancaria;
	}

	public void setEntidadBancaria(EntidadBancaria entidadBancaria) {
		EntidadBancaria = entidadBancaria;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", dni=" + dni + ", EntidadBancaria=" + EntidadBancaria + "]";
	}

}
