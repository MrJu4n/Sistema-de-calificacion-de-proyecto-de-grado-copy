package com.example.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PROFESORES")
public class Profesor {
	
	@Id
	@Column(name = "cedula",updatable = false)
	private long id;
	@Column(nullable = true)
	private String nombre;
	@Column(nullable = true)
	private String apellido;
	@Column(nullable = true, unique = true)
	private String email;
	@Column(nullable = true, unique = true)
	private String telefono;
	private long id_carrera;
	
	public Profesor() {
	}

	public Profesor(long id, String nombre, String apellido, String email, String telefono,
			long id_carrera) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.telefono = telefono;
		this.id_carrera = id_carrera;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public long getId_carrera() {
		return id_carrera;
	}

	public void setId_carrera(long id_carrera) {
		this.id_carrera = id_carrera;
	}
	
	
	
}
