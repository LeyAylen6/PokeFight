package com.example.demo.services;

import com.example.demo.models.APIResponses.GetPokemonById;
import com.example.demo.models.domains.Pokemon;
import com.example.demo.models.domains.Pokemon.PokemonBuilder;
import com.example.demo.repository.PokemonRepository;
import com.example.demo.repository.PokemonsAPI;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

import static com.example.demo.utils.Constants.MAX_POKEMONS;

public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    @Autowired
    PokemonsAPI pokemonsAPI;

    public String savePokemons() throws IOException, InterruptedException {

        for (int i = 1 ; i < MAX_POKEMONS; i++) {

            PokemonBuilder pokemonBuilder  = Pokemon.builder();
            GetPokemonById pokemonById = pokemonsAPI.request(i);

            pokemonBuilder
                    .name(pokemonById.getName())
                    .baseExperience(pokemonById.getBaseExperience());

            Pokemon pokemonToSave = pokemonBuilder.build();
            pokemonRepository.save(pokemonToSave);
        };
        return "Pokemons Created!";
    }
}
