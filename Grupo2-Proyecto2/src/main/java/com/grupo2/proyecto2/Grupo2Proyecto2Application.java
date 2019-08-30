package com.grupo2.proyecto2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.grupo2.proyecto2"})
@EntityScan("com.grupo2.proyecto2.modelo")
@EnableJpaRepositories("com.grupo2.proyecto2.repositorio")

/**
 * Nombre de clase. Main
 * Descripcion. Ejecuta el programa
 * @version 1.0
 * @author grupo2
 * @since 27-08-2019
 */

public class Grupo2Proyecto2Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Grupo2Proyecto2Application.class, args);
	
	}
}
