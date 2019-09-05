package com.grupo2.proyecto2;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.grupo2.proyecto2.controlador.UsuarioControladorRest;


/**
 * Descripcion: Clase para probar si el metodo de buscartodo no este vacio
 * @version 1.0
 * @author mohibul
 *@since 
 *
 */


@RunWith (SpringRunner.class)
@SpringBootTest
public class pruebaMohibul {
	
	
	@Autowired
	private UsuarioControladorRest controladorRest;
	
	
	
	@Test
	public void contextLoads() throws Exception {
		
		//si te devulve 
		
		assertThat(controladorRest.findAll()).isNotEmpty();
		
		
	
	}

}

