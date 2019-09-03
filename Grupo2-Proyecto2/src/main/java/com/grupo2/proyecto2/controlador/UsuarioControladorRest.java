package com.grupo2.proyecto2.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grupo2.proyecto2.modelo.Usuario;
import com.grupo2.proyecto2.repositorio.IContactoRepositorio;
import com.grupo2.proyecto2.repositorio.IDescartesRepositorio;
import com.grupo2.proyecto2.repositorio.IUsuarioRepositorio;
import com.grupo2.proyecto2.servicios.IServicios;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({ "/users" })
public class UsuarioControladorRest {

	@Autowired
	private IServicios servicios;
	@Autowired
	private IUsuarioRepositorio repo;
	@Autowired
	private IContactoRepositorio repocontacto;
	@Autowired
	private IDescartesRepositorio repodescartes;

	@PostMapping (path = { "/adduser" })
	public Usuario crearUsuario(@RequestBody Usuario user) {
		return servicios.crearoEditarUsuarioService(user);
	}

	@GetMapping // (path = { "/{id}" })
	public List<Usuario> listarPerfiles(@RequestBody Usuario user) {

		servicios.crearoEditarUsuarioService(user);
		// service.generaUsuarioRandomService();
		List<Usuario> usu = servicios.listarPerfilesService(user.getGenero());

		return usu;
	}

//		@PutMapping(path = { "/{id}" })
//		public Usuario update(@PathVariable("id") int id, @RequestBody Usuario user) {
//			user.setId(id);
//			return  servicios(user);
//		}

//		@DeleteMapping(path = { "/{id}" })
//		public Usuario delete(@PathVariable("id") int id) {
//			return  servicios.deleteById(id);
//		}

		@GetMapping (path = { "/listall" })
		public List<Usuario> findAll() {
			return  repo.findAll();
		}
		@GetMapping(path = { "/listardescartes/{id}" })
	    public List<Usuario> listarDescartes (@PathVariable("id")int id){//(@PathVariable("id") int id){       //(@RequestBody Usuario user){
			
	        List <Usuario>  descartes = servicios.listarDescartes(id);
	       // System.out.println(user.toString());
	        
	    
	        return descartes;
		}

}
