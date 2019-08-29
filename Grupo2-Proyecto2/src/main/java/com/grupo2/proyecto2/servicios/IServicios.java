package com.grupo2.proyecto2.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.stereotype.Service;

import com.grupo2.proyecto2.modelo.Usuario;


@Service
public interface IServicios {
	
	public Usuario crearoEditarUsuarioService(Usuario usu) ;
	
	public void generaUsuarioRandomService();

	public List<Usuario> listarPerfilesService();
	
	public Usuario geUsuarioById(Integer id) throws RecordTypeNotSupportedException;
	
	public void darLike(Integer idusuario1, Integer idusuario2);

}
