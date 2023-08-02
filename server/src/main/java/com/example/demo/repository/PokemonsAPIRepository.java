package com.example.demo.repository;

import com.example.demo.models.APIResponses.getAppearance.GetAppearanceAndEvolution;
import com.example.demo.models.APIResponses.getEvolutionChain.GetEvolutionChain;
import com.example.demo.models.APIResponses.pokemonById.GetPokemonById;
import com.example.demo.models.OptionalStringTypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Optional;

@NoArgsConstructor
@Repository
public class PokemonsAPIRepository {

    private final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2).build();

    private final Gson gson = new GsonBuilder()
            .registerTypeAdapter(Optional.class, new OptionalStringTypeAdapter())
            .create();

    public GetPokemonById getPokemonById(Integer id) throws IOException, InterruptedException {

        String url = String.format("https://pokeapi.co/api/v2/pokemon/%d", id);

        HttpRequest requestPokemon = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(requestPokemon, HttpResponse.BodyHandlers.ofString());

        // Pido que transforme lo que recibí en la clase PokemonById;
        final GetPokemonById pokemonResponse = new Gson().fromJson(response.body(), GetPokemonById.class);

        System.out.println(pokemonResponse);

        return pokemonResponse;
    };

    public GetEvolutionChain GetEvolutionChain(Integer id) throws IOException, InterruptedException {

        String url = String.format("https://pokeapi.co/api/v2/evolution-chain/%d", id);

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        final GetEvolutionChain pokemonEvolution = new Gson().fromJson(response.body(), GetEvolutionChain.class);

        System.out.println(pokemonEvolution);

        return pokemonEvolution;
    };

    public GetAppearanceAndEvolution getAppearance(Integer id) throws IOException, InterruptedException {

        String url = String.format("https://pokeapi.co/api/v2/pokemon-species/%d", id);

        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        final GetAppearanceAndEvolution pokemonAppearance = new Gson().fromJson(response.body(), GetAppearanceAndEvolution.class);

        System.out.println(pokemonAppearance);

        return pokemonAppearance;
    }
};

