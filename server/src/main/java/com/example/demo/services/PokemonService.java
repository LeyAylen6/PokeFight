package com.example.demo.services;

import com.example.demo.models.APIResponses.getAppearance.GetAppearanceAndEvolution;
import com.example.demo.models.APIResponses.getEvolutionChain.GetEvolutionChain;
import com.example.demo.models.APIResponses.pokemonById.GetPokemonById;
import com.example.demo.models.APIResponses.pokemonById.Types;
import com.example.demo.models.domains.Appearance;
import com.example.demo.models.domains.Pokemon;
import com.example.demo.models.domains.Pokemon.PokemonBuilder;
import com.example.demo.models.domains.Type;
import com.example.demo.repository.PokemonRepository;
import com.example.demo.repository.PokemonsAPI;
import com.example.demo.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

import static com.example.demo.utils.Constants.MAX_POKEMONS;

public class PokemonService {

    @Autowired
    PokemonRepository pokemonRepository;

    @Autowired
    TypeRepository typeRepository;

    @Autowired
    PokemonsAPI pokemonsAPI;

    public String savePokemons() throws IOException, InterruptedException {

        for (int i = 1 ; i < MAX_POKEMONS; i++) {

            PokemonBuilder pokemonBuilder = Pokemon.builder();
            GetPokemonById pokemonById = pokemonsAPI.getPokemonById(i);
            GetEvolutionChain evolution = pokemonsAPI.GetEvolutionChain(i); // Esto no funciona asiii
            GetAppearanceAndEvolution pokemonAppearanceAndEvolution = pokemonsAPI.getAppearance(i);

            saveTypes(pokemonById.getTypes());

            try {
                setPokemonEvolution(pokemonAppearanceAndEvolution, i);
            } catch (Exception e) {
                System.out.println("ERROR EN CATCH");
            }

            pokemonBuilder
                    .name(pokemonById.getName())
                    .baseExperience(pokemonById.getBaseExperience())
                    .hp(pokemonById.getStats().get(0).getHp())
                    .backPhoto(pokemonById.getSprites().getBackPhoto())
                    .frontPhoto(pokemonById.getSprites().getFrontPhoto())
                    .oficialPhoto(pokemonById.getSprites().getOfficialPhoto().getPhoto().getFrontDefault())
                    .evolutionLevel(evolution.getEvolution().getEvolution().get(0).getEvolutionDetail().get(0).getEvolutionLevel())
                    .appearance(getAppearance(pokemonAppearanceAndEvolution))
                    .types(pokemonById.getTypes().stream().map(type -> new Type(type.getPokemonType().getName())).toList());

            Pokemon pokemonToSave = pokemonBuilder.build();
            pokemonRepository.save(pokemonToSave);
        };

        return "Pokemons Created!";
    }

    public Appearance getAppearance(GetAppearanceAndEvolution appearance) throws IOException, InterruptedException {

        Appearance pokemonAppearance = Appearance.normal;

        if (appearance.isLegendary) pokemonAppearance = Appearance.legendary;
        else if (appearance.isMythical) pokemonAppearance = Appearance.mythical;
        else if (appearance.captureRate == 45) pokemonAppearance = Appearance.initial;

        return pokemonAppearance;
    };

    public void saveTypes(List<Types> types) {

        for (Types type : types) {
            String name = type.getPokemonType().getName();

            if (typeRepository.findByName(name).isEmpty()) {
                typeRepository.save(new Type(name));
            }
        }
    }

    public void setPokemonEvolution(GetAppearanceAndEvolution appearanceAndEvolution, Integer currentPokemonId) {

        Integer prevPokemonId = appearanceAndEvolution.isEvolutionOf.pokemonId();

        Optional<Pokemon> prevPokemon = pokemonRepository.findById(prevPokemonId);

        if (prevPokemon.isEmpty()) throw new RuntimeException(); // CREAR ERROR

        prevPokemon
                .get()
                .setEvolution(currentPokemonId);
    }
}
