package com.grupo2.proyecto2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Nombre de clase. Usuario
 * Descripcion. Objeto modelo de Usuario el cual usaremos con JPA par insertar y extraer datos.
 * @version 1.0
 * @author grupo2
 * @since 27-08-2019
 */

@Entity
@Table(name="usuarios")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Usuario {
	
	public Usuario() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	    
	@Column
	private String nombre;
	    
	@Column
	private String genero;
	    
	@Column
	private Integer edad;

	@Column
	private String descripcion;


	public Integer getId() {

		return id;
	}

	
	public void setId(Integer id) {
	
		this.id = id;
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

	public Integer getEdad() {
		
		return edad;
	}

	public void setEdad(Integer edad) {
		
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
	
	return "Usuario [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", descripcion="
			+ descripcion + "]";
	}

}
