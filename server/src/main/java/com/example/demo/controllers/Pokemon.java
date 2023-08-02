package com.example.demo.controllers;

import com.example.demo.models.domains.Pokemon;
import com.example.demo.repository.PokemonRepository;
import com.example.demo.repository.PokemonsAPI;
import com.example.demo.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/pokemon")
public class BulkPokemons {

    @Autowired
    PokemonService pokemonService;

    @PostMapping
    public String savePokemons() throws IOException, InterruptedException { // CREAR ERRRORR
        return pokemonService.savePokemons();
    }

}
