package com.grupo2.proyecto2.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo2.proyecto2.modelo.Contacto;

/**
 * Nombre de clase. IContactoRepositorio.
 * Descripcion. Objeto modelo de usuario.
 * @version 1.0
 * @author grupo2
 * @since 27-08-2019
 */

@Repository
public interface IContactoRepositorio extends JpaRepository<Contacto, Integer>,IUsuarioRepositorioCustom{

	
	List<Contacto> findByIdusuariocontact1(int iduserlogged);
}
