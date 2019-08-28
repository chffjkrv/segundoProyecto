package com.grupo2.proyecto2.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.proyecto2.modelo.Usuario;


@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer>,IUsuarioRepositorioCustom{
	
	
}

