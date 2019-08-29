package com.grupo2.proyecto2.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;
import com.grupo2.proyecto2.modelo.Contacto;
import com.grupo2.proyecto2.modelo.Descartes;
import com.grupo2.proyecto2.modelo.Matches;
import com.grupo2.proyecto2.modelo.Usuario;
import com.grupo2.proyecto2.repositorio.IContactoRepositorio;
import com.grupo2.proyecto2.repositorio.IUsuarioRepositorio;


/**
 * Clase Servicios: incluye todos los metodos para interactuar con el repositorio
 * @author Grupo2
 * @version 1.0
 * @since 27-08-2019
 */


@Service
public class Servicios implements IServicios {
	
@Autowired
IUsuarioRepositorio repositorio;

@Autowired
IContactoRepositorio repocontacto;


@Override
	public Usuario crearoEditarUsuarioService(Usuario usu) {
	
		if(usu.getid()  == null) {
			usu = repositorio.save(usu);			
			return usu;
		} else {
			Optional<Usuario> usuario = repositorio.findById(usu.getid());
			
			if(usuario.isPresent()) {
				Usuario newUser = usuario.get();
				newUser.setNombre(usu.getNombre());
				newUser.setGenero(usu.getGenero());
				newUser.setEdad(usu.getEdad());
				newUser.setDescripcion(usu.getDescripcion());
				newUser = repositorio.save(newUser);
	
				return newUser;
			} else {
				usu = repositorio.save(usu);
				return usu;
			}
		}
	}

@Override
	public void generaUsuarioRandomService() {
		Faker faker = new Faker((new Locale("{en-US}")));
		
		for (int i = 0; i <=60; i++) {
			Usuario rnd= new Usuario();
			rnd.setNombre(faker.name().firstName());
			rnd.setGenero(faker.demographic().sex());
			rnd.setEdad(faker.number().numberBetween(12, 90));
			rnd.setDescripcion(faker.dog().memePhrase());
			crearoEditarUsuarioService(rnd);
		}
	}

@Override
	public List<Usuario> listarPerfilesService() {
		List<Usuario> result = (List<Usuario>) repositorio.findAll();
		
		if(result.size() > 0) {
			return result;
		} else {
		return new ArrayList<Usuario>();	
			} 
	}

	public Usuario geUsuarioById(Integer id){
		if(repositorio.getOne(id) != null) {
	      return repositorio.getOne(id);
		} else {
			System.out.println("NO EXISTE ESTE ID");
			return null;
			}
	}

	public void darLike(Integer idusuario1,Integer idusuario2) {		
		
	}

@Override
	public void crearContactoService(int idusuario1, int idusuario2) {
	
		Contacto contacto = new Contacto();
		contacto.setIdusuario1(idusuario1);
		contacto.setIdusuario2(idusuario2);
		repocontacto.save(contacto);
	}

@Override
	public void crearDescarteService(int idusuario1, int idusuario2) {
	
		Descartes descarte = new Descartes();
		descarte.setIdusuario1(idusuario1);
		descarte.setIdusuario2(idusuario2);
		repocontacto.save(descarte);
	}

@Override
	public void crearMatchService(int idusuario1, int idusuario2) {
	
		Matches match = new Matches();
		match.setIdusuario1(idusuario1);
		match.setIdusuario2(idusuario2);
		repositorio.save(match);
	}	
}