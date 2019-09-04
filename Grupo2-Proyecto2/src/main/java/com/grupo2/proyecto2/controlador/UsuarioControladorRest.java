package com.grupo2.proyecto2.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.proyecto2.modelo.Usuario;
import com.grupo2.proyecto2.repositorio.IUsuarioRepositorio;
import com.grupo2.proyecto2.servicios.IServicios;

/**
 * Nombre de clase. UsuarioControlador con REST.
 * Descripcion. Capa encargada de gestionar el flujo de datos para ofrecerselos al front.
 * @version 2.0
 * @author grupo2
 * @since 04-09-2019
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/users" })
public class UsuarioControladorRest {
	
	private static final Logger logger = LoggerFactory.getLogger(UsuarioControladorRest.class);
	@Autowired
	private IServicios servicios;
	@Autowired
	private IUsuarioRepositorio repo;

	@PostMapping(path = { "/adduser" })
	public Usuario crearUsuario(@RequestBody Usuario user) {
		logger.info("----Agnadiendo Usuario----");
		return servicios.crearoEditarUsuarioService(user);
	}

	@GetMapping(path = { "/login/{id}" })
	public Usuario login(@PathVariable("id") int id) {
		logger.info("----Logeando----");
		return servicios.geUsuarioById(id);
	}

	@GetMapping 
	public List<Usuario> listarPerfiles(@RequestBody Usuario user) {
		logger.info("----Recibiendo Perfiles----");
		servicios.crearoEditarUsuarioService(user);
		List<Usuario> usu = servicios.listarPerfilesService(user.getGenero());

		return usu;
	}

	@GetMapping(path = { "/listall" })
	public List<Usuario> findAll() {
		logger.info("----Recibiendo todos los usuarios----");
		return repo.findAll();
	}

	@GetMapping(path = { "/darlike/{id1}/{id2}" })
	public void darLike(@PathVariable("id1") int id1, @PathVariable("id2") int id2) {
		logger.info("----Dando like----");
		servicios.crearContactoService(id1, id2);

	}

	@GetMapping(path = { "/dardislike/{id1}/{id2}" })
	public void darDisike(@PathVariable("id1") int id1, @PathVariable("id2") int id2) {
		logger.info("----Dando dislike----");
		servicios.crearDescarteService(id1, id2);

	}

	@GetMapping(path = { "/listardescartes/{id}" })
	public List<Usuario> listarDescartes(@PathVariable("id") int id) {
		logger.info("----Recibiendo descartes----");
		List<Usuario> descartes = servicios.listarDescartes(id);

		return descartes;
	}

	@GetMapping(path = { "/listarcontactos/{id}" })
	public List<Usuario> listarContactos(@PathVariable("id") int id) {
		logger.info("----Recibiendo contactos----");
		List<Usuario> contactos = servicios.listarContactos(id);

		return contactos;
	}

}
