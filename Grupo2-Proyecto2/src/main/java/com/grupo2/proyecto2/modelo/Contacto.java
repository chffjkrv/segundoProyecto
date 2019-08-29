package com.grupo2.proyecto2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Nombre de clase. Contacto.
 * Descripcion. Objeto modelo de Contacto el cual usaremos con JPA par insertar y extraer datos.
 * @version 1.0
 * @author grupo2
 * @since 27-08-2019
 */

@Entity
@Table(name="contactos")
public class Contacto {

	
	@Column
	private Integer idusuario1;
	
	
	@Column
	private Integer idusuario2;
	
	public Contacto() {
		super();
	}


	public Integer getIdusuario1() {
		return idusuario1;
	}


	public void setIdusuario1(Integer idusuario1) {
		this.idusuario1 = idusuario1;
	}


	public Integer getIdusuario2() {
		return idusuario2;
	}



	public void setIdusuario2(Integer idusuario2) {
		this.idusuario2 = idusuario2;
	}


	@Override
	public String toString() {
		return "Contactos [idusuario1=" + idusuario1 + ", idusuario2=" + idusuario2 + "]";
	}
}