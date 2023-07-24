package com.example.demo;

import com.example.demo.repository.PokemonRepository;
import com.example.demo.repository.PokemonsAPI;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.io.IOException;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		SpringApplication.run(DemoApplication.class, args);

		PokemonsAPI pokemons = new PokemonsAPI(); //Si paso pokemonsAPI a Static no hace falta que le haga una instancia
		pokemons.request(1);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Hello World!");
		};
	}

}
