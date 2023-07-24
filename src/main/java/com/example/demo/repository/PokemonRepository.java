package com.example.demo.repository;

import com.example.demo.models.APIResponses.GetPokemonById;
import com.example.demo.models.domains.Pokemon;
import com.google.gson.Gson;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {


};
