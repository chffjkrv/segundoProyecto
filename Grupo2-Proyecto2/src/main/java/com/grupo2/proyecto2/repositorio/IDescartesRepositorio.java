package com.grupo2.proyecto2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grupo2.proyecto2.modelo.Descartes;

/**
 * Nombre de clase. IContactoRepositorio.
 * Descripcion. Objeto modelo de usuario.
 * @version 1.0
 * @author grupo2
 * @since 27-08-2019
 */

public interface IDescartesRepositorio extends JpaRepository<Descartes, Integer>,IUsuarioRepositorioCustom{

}
