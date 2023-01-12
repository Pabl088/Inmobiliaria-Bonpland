package com.bonpland.bonpland;

import com.bonpland.bonpland.entities.Direccion;
import com.bonpland.bonpland.repositories.DireccionRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BonplandApplication {

	/**
	 * Creando datos de prueba para la aplicacion
	 */
	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BonplandApplication.class, args);

		DireccionRepository direccionRepository =  context.getBean(DireccionRepository.class);
		direccionRepository.save(new Direccion(null, "Consulado", "208","Centro Habana", "La Habana", "La Habana", "Cuba"));
		direccionRepository.save(new Direccion(null, "10", "161", "Santa Barbara", "Santiago de Cuba", "Santiago de Cuba", "Cuba"));
		direccionRepository.save(new Direccion(null, "C", "10A","La Cuba", "Contramaestre", "Santiago de Cuba", "Cuba"));

	}

}
