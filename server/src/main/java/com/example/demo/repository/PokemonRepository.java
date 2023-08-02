package com.example.demo.repository;

import com.example.demo.models.domains.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Integer> {


};
