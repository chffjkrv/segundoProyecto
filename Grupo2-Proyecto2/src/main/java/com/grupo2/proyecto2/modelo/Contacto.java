package com.grupo2.proyecto2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;





@Entity
@Table(name="contactos")
public class Contacto {

	
	public Contacto() {
		super();
	}
	
	
	
	
	@Column
	private Integer idusuariocontact1;
	
	
	@Column
	private Integer idusuariocontact2;


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
