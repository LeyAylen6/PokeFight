package com.example.demo.models.APIResponses.pokemonById;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Getter
@ToString
public class GetPokemonById {

    @SerializedName("name")
    public String name;

    @SerializedName("base_experience")
    public Integer baseExperience;
    
    @SerializedName("stats")
    public List<Stats> stats;

    @SerializedName("sprites")
    public Sprites sprites;

    @SerializedName("types")
    public List<Types> types;

}
