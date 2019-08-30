package com.grupo2.proyecto2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Nombre de clase. Descartes. 
 * Descripcion. Objeto modelo de Descartes el cual usaremos con JPA par insertar y extraer datos.
 * @version 1.0
 * @author grupo2
 * @since 27-08-2019
 */

@Entity
@Table(name="descartes")
public class Descartes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer iddescarte;

	@Column
	private Integer idusuario1;
	
	@Column
	private Integer idusuario2;

	public Descartes() {
		super();
	}

	public Descartes(Integer idusuario1, Integer idusuario2) {
		super();
		this.idusuario1 = idusuario1;
		this.idusuario2 = idusuario2;
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
		return "Descartes [idusuario1=" + idusuario1 + ", idusuario2=" + idusuario2 + "]";
	}	
}
