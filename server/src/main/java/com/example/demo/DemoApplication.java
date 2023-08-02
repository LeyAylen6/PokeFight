package com.example.demo;

import com.example.demo.models.APIResponses.getAppearance.IsEvolutionOf;
import com.example.demo.models.OptionalStringTypeAdapter;
import com.example.demo.repository.PokemonRepository;
import com.example.demo.repository.PokemonsAPIRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.util.Optional;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(DemoApplication.class, args);

		PokemonsAPIRepository pokemons = new PokemonsAPIRepository(); //Si paso pokemonsAPI a Static no hace falta que le haga una instancia
//		pokemons.getPokemonById(2);
//		pokemons.GetEvolutionChain(1);
//		pokemons.getAppearance(2);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Hello World!");
		};
	}

}
