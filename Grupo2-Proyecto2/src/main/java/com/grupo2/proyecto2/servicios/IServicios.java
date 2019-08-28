package com.grupo2.proyecto2.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.jca.cci.RecordTypeNotSupportedException;

import com.grupo2.proyecto2.modelo.Usuario;


public interface IServicios {

	public Usuario crearoEditarUsuarioService(Usuario usu) ;
	
	public void generaUsuarioRandomService();

	public List<Usuario> listarPerfilesService();
	
	public Usuario geUsuarioById(Integer id) throws RecordTypeNotSupportedException;

}
