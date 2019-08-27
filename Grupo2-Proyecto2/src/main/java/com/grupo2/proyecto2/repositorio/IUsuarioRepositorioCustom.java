package com.grupo2.proyecto2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo2.proyecto2.modelo.Usuario;


public interface IUsuarioRepositorioCustom extends JpaRepository<Usuario, Integer> {

}
