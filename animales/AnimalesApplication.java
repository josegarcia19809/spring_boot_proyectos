package com.josegarcia.animales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AnimalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimalesApplication.class, args);
		System.out.println("Servidor ejecutandose en el puerto 8080...");
	}
}
