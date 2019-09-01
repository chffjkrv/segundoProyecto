package com.grupo2.proyecto2.repositorio;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.proyecto2.modelo.Usuario;

/**
 * Nombre de clase. IUsuarioRepository.
 * Descripcion. Interfaz de la capa repositorio en la cual se implementa el JPARepository.
 * @version 1.0
 * @author grupo2
 * @since 27-08-2019
 */

@Repository
public interface IUsuarioRepositorio extends JpaRepository<Usuario, Integer>,IUsuarioRepositorioCustom{
	
	List<Usuario> findByGenero(String generopreferido);
}

