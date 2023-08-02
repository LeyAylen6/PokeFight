package com.example.demo.controllers;

import com.example.demo.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/pokemon")
public class Pokemon {

    @Autowired
    PokemonService pokemonService;

    @PostMapping
    public String savePokemons() throws IOException, InterruptedException { // CREAR ERRRORR
        return pokemonService.savePokemons();
    }

}
