package com.Good_Morning_world.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="estados")
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id_estado;
	@Column(name="nombre_estado")
	private String nombre;
	public Estado() {
		// TODO Auto-generated constructor stub
	}
	public int getId_estado() {
		return id_estado;
	}
	public void setId_estado(int id_estado) {
		this.id_estado = id_estado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
