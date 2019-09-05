package com.grupo2.proyecto2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.grupo2.proyecto2.repositorio.IContactoRepositorio;

/**
 * Descripcion: Clase para probar si el 
 * @author Dani
 * 
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class pruebaDani {

	@Autowired
	private IContactoRepositorio repositorio;
	
	@Test
	public void contextLoads() throws Exception {
		//Si esta bien TRUE
		assertThat(repositorio).isNotNull();
		
		//Si se busca un false, usar el siguiente metodo.
		//assertThat(repositorio).isNull();
	}

}

