package com.grupo2.proyecto2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.proyecto2.modelo.Usuario;

/**
 * @author Grupo 2
 * @since 27-08-2019
 * @version 1.0
 */
@Repository
public interface IRepo extends JpaRepository<Usuario, Integer>{

}
