package com.grupo2.proyecto2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="contactos")
public class Contactos {

	
	public Contactos() {
		super();
	}
	
	
	@Column
	private Integer idusuario1;
	
	
	@Column
	private Integer idusuario2;


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
