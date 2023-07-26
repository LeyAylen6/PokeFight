package com.example.demo.repository;

import com.example.demo.models.APIResponses.GetPokemonById;
import com.google.gson.Gson;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

@NoArgsConstructor
public class PokemonsAPI {

    private final HttpClient client = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2).build();

    public GetPokemonById request(Integer id) throws IOException, InterruptedException {

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
};

