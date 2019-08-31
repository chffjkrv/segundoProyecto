package com.grupo2.proyecto2.repositorio;

import java.util.List;

import com.grupo2.proyecto2.modelo.Contacto;

/**
 * Nombre de clase. IUsuarioRepositoryCustom.
 * Descripcion. Interfaz de la capa repositorio en la cual se implementa querys propias 
 * 				a la interfaz donde esta implementado el JPARepository.
 * @version 1.0
 * @author grupo2
 * @since 27-08-2019
 */
public interface IUsuarioRepositorioCustom {

	
	List<Contacto> findIdusuariocontact2ByIdusuariocontact1(int iduserlogged);
}
