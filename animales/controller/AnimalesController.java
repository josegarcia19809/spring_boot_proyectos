package com.josegarcia.animales.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalesController {
    @GetMapping("/")
    public String index() {
        return "<h1>Mis animales favoritos</h1>";
    }

    @GetMapping("/perro")
    public String mostrarPerro() {
        return "<h1>Perro Firulais 🐶 </h1>";
    }

    @GetMapping("/gato")
    public String mostrarGato(){
        return "<h2>Gato Mixi 🐱</h2>";
    }
}
