package com.grupo2.proyecto2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo2.proyecto2.modelo.Contacto;

public interface IContactoRepositorio extends JpaRepository<Contacto, Integer>,IUsuarioRepositorioCustom{
	
	

}
