/**
 * 
 */
package com.grupo2.proyecto2.controlador;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grupo2.proyecto2.modelo.Usuario;
import com.grupo2.proyecto2.servicios.IServicios;





/**
 * Clase UsuarioControlador: controlador de las paginas
 * @author Grupo 2
 * @since 27-08-2019
 * @version 1.0
 *
 */
@Controller
@RequestMapping("/")

public class UsuarioControlador {
	@Autowired	
	IServicios service;

	private static final Logger logger = LoggerFactory.getLogger(UsuarioControlador.class);
	

	
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  
	  public String initForm(@ModelAttribute("usuario") Usuario usuario) {
		 
	      return "PagLogin";
	  }	
	  
	@PostMapping(value="/listados")
	public String listarPerfiles(ModelMap model,Usuario usuario) {
		service.crearoEditarUsuarioService(usuario);
		service.generaUsuarioRandomService();
		List<Usuario> usu = service.listarPerfilesService();
		model.addAttribute("usuarios", usu); //model.addAttribute("Usuario",usuario)
		return "PagListado";
	}
		  
	  
	  @RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
	  public String processSubmit(
	          @ModelAttribute("usuario") Usuario usuario,
	          ModelMap model) {
	      model.addAttribute(usuario);
	      return "PagPerfil";
	  }
	  
	  
		@RequestMapping(path =  "/login")
		public String encontrarUsuarioById(
		          @ModelAttribute("usuario") Usuario usuario,
		          ModelMap model) 
		{
			System.out.println(usuario.getid());
			usuario = service.geUsuarioById(usuario.getid());
			System.out.println(usuario);
				return "PagListado";
			

		}
//	  @GetMapping(value="/random")
//		public  String newRandom(ModelMap model) {
//			
//			logger.info("-- en RANDOM");
//			Faker faker = new Faker((new Locale("{en-US}")));
//			Usuario rndi= new Usuario();
//			rnd.setNombre(faker.name().firstName());
//			rnd.setGenero(faker.demographic().sex());
//	 		rnd.setEdad(faker.number().numberBetween(12, 90));
//			rnd.setDescripcion(faker.yoda().quote());
//			model.addAttribute("user",(service.generaUsuarioRandomService()));
//			//service.crearoEditarUsuarioService(rnd);
//			return "redirect:/";
//		
//	}
	  
	  
	  
	  
}

 