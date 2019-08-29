package com.grupo2.proyecto2.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="matches")
public class Matches {

	@Column
	private Integer idusuario1;
	
	@Column
	private Integer idusuario2;

	public Matches() {
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
		return "Matches [idusuario1=" + idusuario1 + ", idusuario2=" + idusuario2 + "]";
	}
	
	
	
}
