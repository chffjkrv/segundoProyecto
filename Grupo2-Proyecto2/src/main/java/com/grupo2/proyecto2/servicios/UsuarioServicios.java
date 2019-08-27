package com.grupo2.proyecto2.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.grupo2.proyecto2.repositorio.IUsuarioRepositorio;

@Service
public class UsuarioServicios {
	
	@Autowired
	IUsuarioRepositorio repositorio;
	
	
	
	
}
