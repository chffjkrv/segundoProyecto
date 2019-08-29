package com.grupo2.proyecto2.servicios;

import java.util.List;

import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.stereotype.Service;

import com.grupo2.proyecto2.modelo.Usuario;


@Service
public interface IServicios {
	
	public Usuario crearoEditarUsuarioService(Usuario usu) ;
	
	public void generaUsuarioRandomService();

	public List<Usuario> listarPerfilesService();
	
	public Usuario geUsuarioById(Integer id) throws RecordTypeNotSupportedException;
	
<<<<<<< HEAD
	public void darLike(Integer idusuario1, Integer idusuario2);

=======
	public public void crearContactoService(int idusuario1,int idusuario2);
	
	public void crearDescarteService(int idusuario1,int idusuario2);
	
	public void crearMatchService(int idusuario1, int idusuario2);
>>>>>>> a0343493c36c3b13f45b0b3c6f6b188fc836c3eb
}
