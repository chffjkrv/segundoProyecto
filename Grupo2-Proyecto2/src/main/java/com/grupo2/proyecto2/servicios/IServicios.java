package com.grupo2.proyecto2.servicios;

import java.util.List;

import org.springframework.jca.cci.RecordTypeNotSupportedException;
import org.springframework.stereotype.Service;

import com.grupo2.proyecto2.modelo.Usuario;

/**
 * Nombre de clase. IServicios.
 * Descripcion. Interfaz de capa usuarios para definir los metodos que se implementaran en Servicios.
 * @version 1.0
 * @author grupo2
 * @since 29-08-2019
 */
@Service
public interface IServicios {
	
	public Usuario crearoEditarUsuarioService(Usuario usu) ;
	
	public void generaUsuarioRandomService();

	public List<Usuario> listarPerfilesService();
	
	public Usuario geUsuarioById(Integer id) throws RecordTypeNotSupportedException;
	
	public void crearContactoService(int idusuario1,int idusuario2);

	public void crearDescarteService(int idusuario1,int idusuario2);
	
	public void crearMatchService(int idusuario1, int idusuario2);

}
