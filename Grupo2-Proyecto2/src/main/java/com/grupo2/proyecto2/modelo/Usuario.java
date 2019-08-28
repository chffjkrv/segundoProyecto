package com.grupo2.proyecto2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase Usuario: modelo de la clase usurio con sus atributos
 * @author Grupo2
 * @version 1.0
 * @since 27-08-2019
 *
 */
@Entity
@Table(name="usuarios")
public class Usuario {
	
	public Usuario() {
		super();
	}
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="idUsuario")
private Integer idUsuario;
	    
@Column(name="nombre")
private String nombre;
	    
@Column(name="genero")
private String genero;
	    
@Column(name="edad")
private int edad;

@Column(name="descripcion")
private String descripcion;


public Integer getId() {
	return idUsuario;
}

public void setId(Integer idUsuario) {
	this.idUsuario = idUsuario;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getGenero() {
	return genero;
}

public void setGenero(String genero) {
	this.genero = genero;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

@Override
public String toString() {
	return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", descripcion="
			+ descripcion + "]";
}

	
}
