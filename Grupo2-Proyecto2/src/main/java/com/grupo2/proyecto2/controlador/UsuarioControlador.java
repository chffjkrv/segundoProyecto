/**
 * 
 */
package com.grupo2.proyecto2.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grupo2.proyecto2.modelo.Usuario;
import com.grupo2.proyecto2.servicios.IServicios;

/**
 * Nombre de clase. UsuarioControlador.
 * Descripcion. Capa encargada de gestionar el flujo del front en html.
 * @version 1.0
 * @author grupo2
 * @since 27-08-2019
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
		//service.generaUsuarioRandomService();
		List<Usuario> usu = service.listarPerfilesService(usuario.getGenero());
		model.addAttribute("usuarios", usu);
		logger.info("hihi");
		return "PagListado";
	}

	
	@RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
	public String processSubmit(@ModelAttribute("usuario") Usuario usuario, ModelMap model){
	
		model.addAttribute(usuario);
		
		return "PagPerfil";
	  }
	  
	  
	@RequestMapping(path =  "/login")
	public String encontrarUsuarioById(@ModelAttribute("usuario") Usuario usuario, ModelMap model,
										@ModelAttribute("usuario2") Usuario usuario2, ModelMap model2){

		usuario = service.geUsuarioById(usuario.getId());

		List<Usuario> usu = service.listarPerfilesService(usuario.getGenero());
		model.addAttribute("usuarios", usu);
		model.addAttribute("usuario", usuario);
		
		return "PagListado";
	}
		
		
	@GetMapping(path="/darlike")
	public String darLike(@ModelAttribute("usuario") Usuario usuario, ModelMap model,
			@ModelAttribute("usuario2") Usuario usuario2, ModelMap model2){
		
		service.crearContactoService(usuario.getId(), usuario2.getId());
		

		List<Usuario> usu = service.listarPerfilesService(usuario.getGenero());
		model.addAttribute("usuarios", usu);
		return"PagListado";
	}
	
	
	@RequestMapping(path="/contactos")
    public String contacto(@ModelAttribute("usuario") Usuario usuario, ModelMap model){
		
        List <Usuario>  usu = service.listarContactos(usuario.getId());
        System.out.println(usu.toString());
        model.addAttribute("usuarios",usu);
    
        return "PagLikesDislikes";
    }
	
	@GetMapping(path="/darDislike")
	public String darDisLike(@ModelAttribute("usuario") Usuario usuario, ModelMap model,
			@ModelAttribute("usuario2") Usuario usuario2, ModelMap model2){
		
		service.crearDescarteService(usuario.getId(), usuario2.getId());
		

		List<Usuario> usu = service.listarPerfilesService(usuario.getGenero());
		model.addAttribute("usuarios", usu);
		return"PagListado";
	}
	
	
	@RequestMapping(path="/descarte")
    public String descarte(@ModelAttribute("usuario") Usuario usuario, ModelMap model){
		
        List <Usuario>  usu = service.listarDescartes(usuario.getId());
        System.out.println(usu.toString());
        model.addAttribute("usuarios",usu);
    
        return "PagLikesDislikes";
    }


}