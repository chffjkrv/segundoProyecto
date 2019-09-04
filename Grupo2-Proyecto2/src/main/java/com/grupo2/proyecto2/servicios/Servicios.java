package com.grupo2.proyecto2.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.javafaker.Faker;
import com.grupo2.proyecto2.modelo.Contacto;
import com.grupo2.proyecto2.modelo.Descartes;
import com.grupo2.proyecto2.modelo.Usuario;
import com.grupo2.proyecto2.repositorio.IContactoRepositorio;
import com.grupo2.proyecto2.repositorio.IDescartesRepositorio;
import com.grupo2.proyecto2.repositorio.IUsuarioRepositorio;

/**
 * Clase Servicios: incluye todos los metodos para interactuar con el
 * repositorio
 * 
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

	@Autowired
	IDescartesRepositorio repodescarte;
	
	private static final Logger logger = LoggerFactory.getLogger(Servicios.class);

	@Override
	public Usuario crearoEditarUsuarioService(Usuario usu) {

		if (usu.getId() == null) {
			usu = repositorio.save(usu);
			return usu;
		} else {
			Optional<Usuario> usuario = repositorio.findById(usu.getId());

			if (usuario.isPresent()) {
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

		for (int i = 0; i <= 20; i++) {
			Usuario rnd = new Usuario();
			rnd.setNombre(faker.name().firstName());
			rnd.setGenero(faker.demographic().sex());
			rnd.setEdad(faker.number().numberBetween(12, 90));
			rnd.setDescripcion(faker.dog().memePhrase());
			crearoEditarUsuarioService(rnd);
		}
	}

	@Override
	public List<Usuario> listarPerfilesService(String generouserlogeado) {
		// List<Usuario> result = (List<Usuario>) repositorio.findAll();
		List<Usuario> result = (List<Usuario>) repositorio.findByGeneroNotIgnoreCase(generouserlogeado);

		List<Usuario> result20 = new ArrayList<Usuario>();

		if (result.size() > 0) {
			for (int i = 0; i <= 20; i++) {
				result20.add(result.get(i));
			}
			return result20;
		} else {
			return new ArrayList<Usuario>();
		}
	}

	public Usuario geUsuarioById(Integer id) {
		if (repositorio.getOne(id) != null) {
			return repositorio.getOne(id);
		} else {
			System.out.println("NO EXISTE ESTE ID");
			return null;
		}
	}

	@Override
	public void crearContactoService(int idusuario1, int idusuario2) {

		Contacto contacto = new Contacto();
		contacto.setidusuariocontact1(idusuario1);
		contacto.setidusuariocontact2(idusuario2);
		repocontacto.save(contacto);
	}

	@Override
	public void crearDescarteService(int idusuario1, int idusuario2) {

		Descartes descarte = new Descartes();
		descarte.setIdusuario1(idusuario1);
		descarte.setIdusuario2(idusuario2);
		repodescarte.save(descarte);
	}

	@Override
	public List<Usuario> listarContactos(int iduserlogeado) {
		// usuarios que le gustan al usuario que esta logeado
		List<Contacto> results = (List<Contacto>) repocontacto.findByIdusuariocontact1(iduserlogeado);
		List<Usuario> usuarioslikeados = new ArrayList<Usuario>();
		for (Contacto c : results) {
			usuarioslikeados.add(repositorio.getOne(c.getidusuariocontact2()));

		}
		usuarioslikeados.forEach(System.out::println);

		if (usuarioslikeados.size() > 0) {
			return usuarioslikeados;
		} else {
			return new ArrayList<Usuario>();
		}

	}

	@Override
	public List<Usuario> listarDescartes(int iduserlogeado) {
		List<Descartes> results = (List<Descartes>) repodescarte.findByIdusuario1(iduserlogeado);
		List<Usuario> usuariosdescartados = new ArrayList<Usuario>();
		for (Descartes d : results) {
			usuariosdescartados.add(repositorio.getOne(d.getIdusuario2()));

		}
		usuariosdescartados.forEach(System.out::println);

		if (usuariosdescartados.size() > 0) {
			return usuariosdescartados;
		} else {
			return new ArrayList<Usuario>();
		}
	}

}