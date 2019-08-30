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

	
<<<<<<< HEAD
	public Contacto() {
		super();
	}
	
	
	
	
=======
>>>>>>> b4dfa76c4fd6e267d635b790a9dcf314cb5ccd9d
	@Column
	private Integer idusuariocontact1;
	
	
	@Column
<<<<<<< HEAD
	private Integer idusuariocontact2;
=======
	private Integer idusuario2;
	
	public Contacto() {
		super();
	}
>>>>>>> b4dfa76c4fd6e267d635b790a9dcf314cb5ccd9d


	public Integer getidusuariocontact1() {
		return idusuariocontact1;
	}


	public void setidusuariocontact1(Integer idusuariocontact1) {
		this.idusuariocontact1 = idusuariocontact1;
	}


	public Integer getidusuariocontact2() {
		return idusuariocontact2;
	}



	public void setidusuariocontact2(Integer idusuariocontact2) {
		this.idusuariocontact2 = idusuariocontact2;
	}


	@Override
	public String toString() {
		return "Contactos [idusuario1=" + idusuariocontact1 + ", idusuario2=" + idusuariocontact2 + "]";
	}
}