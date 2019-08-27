/**
 * 
 */
package com.grupo2.proyecto2.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.grupo2.proyecto2.modelo.Usuario;
import com.grupo2.proyecto2.servicios.UsuarioServicios;
import com.grupo2.proyecto2.controlador.UsuarioControlador;



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
	UsuarioServicios service;
	private static final Logger logger = LoggerFactory.getLogger(UsuarioControlador.class);
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  
	  public String initForm(@ModelAttribute("Usuario") Usuario Usuario) {

	      return "PagLogin2";
	  }	
	  
	  @RequestMapping(value = "/addUsuario", method = RequestMethod.POST)
	  public String processSubmit(
	          @ModelAttribute("usuario") Usuario usuario,
	          ModelMap model) {
	      model.addAttribute(usuario);
	      return "PagPerfil";
	  }
	  
	  
}

 