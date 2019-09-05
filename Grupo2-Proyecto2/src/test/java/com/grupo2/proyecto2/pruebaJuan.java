/**
 * 
 */
package com.grupo2.proyecto2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.grupo2.proyecto2.repositorio.IUsuarioRepositorio;

/**
 * Descripcion: Clase para probar si el repositorio Usuario esta bien montado
 * @version 1.0
 * @author Juan
 * @since 02-09-2019
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class pruebaJuan {

	@Autowired
	private IUsuarioRepositorio repositorio;
	
	@Test
	public void contextLoads() throws Exception {
		//Si esta bien deberia de dar true
		assertThat(repositorio).isNotNull();
		
		//Se podria forzar un fallo diciendo que es nulo
		//assertThat(repositorio).isNull();
	}

}
