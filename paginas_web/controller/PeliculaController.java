package com.ico.paginas_web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import java.util.Date;

@Controller
public class PeliculaController {
    @GetMapping("/pelicula")
    public String pelicula(Model model) {
        model.addAttribute("mensaje", "Bienvenido a su sitio de películas");
        model.addAttribute("nombre", "José L. García");

        String titulo = "The avengers";
        Date fechaResenia = new Date();
        String genero = "Action";
        int anioEstreno = 2012;
        double rating = 8.1;
        boolean vigente = true;

        model.addAttribute("titulo", titulo);
        model.addAttribute("fechaResenia", fechaResenia);
        model.addAttribute("genero", genero);
        model.addAttribute("anioEstreno", anioEstreno);
        model.addAttribute("rating", rating);
        model.addAttribute("vigente", vigente);

        return "pelicula";
    }

    @GetMapping("/episodios")
    public String episodios(Model model) {

        String titulo1 = "Breaking bad";
        String titulo2 = "Attack on Titan";
        String titulo3 = "Attack on Titan";
        String titulo4 = "Star Wars: The clone Wars";
        String titulo5 = "Mr. Robot";

        String episodio1 = "Ozymandias";
        String episodio2 = "Hero";
        String episodio3 = "Perfect Game";
        String episodio4 = "Victory and Death";
        String episodio5 = "407 Proxy Authentication Required";

        double rating1 = 10.0;
        double rating2 = 9.9;
        double rating3 = 9.9;
        double rating4 = 9.9;
        double rating5 = 9.9;

        model.addAttribute("titulo1", titulo1);
        model.addAttribute("titulo2", titulo2);
        model.addAttribute("titulo3", titulo3);
        model.addAttribute("titulo4", titulo4);
        model.addAttribute("titulo5", titulo5);

        model.addAttribute("episodio1", episodio1);
        model.addAttribute("episodio2", episodio2);
        model.addAttribute("episodio3", episodio3);
        model.addAttribute("episodio4", episodio4);
        model.addAttribute("episodio5", episodio5);

        model.addAttribute("rating1", rating1);
        model.addAttribute("rating2", rating2);
        model.addAttribute("rating3", rating3);
        model.addAttribute("rating4", rating4);
        model.addAttribute("rating5", rating5);

        return "episodios";
    }
}
