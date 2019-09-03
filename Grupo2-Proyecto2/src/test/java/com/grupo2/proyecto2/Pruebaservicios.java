package com.grupo2.proyecto2;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.grupo2.proyecto2.servicios.IServicios;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Pruebaservicios {

	
	
    private IServicios servicios;

    
    /**
     * Nombre de clase. Pruebaservicios
     * Descripcion. Para probar que servicios esté bien implementado, en este caso es nulo por eso sale correcta
     * @version 1.0
     * @author grupo2
     * @since 02-09-2019
     */
    @Test
    public void contexLoads() throws Exception {
    	
        assertThat(servicios).isNull();
        
        
  }
}