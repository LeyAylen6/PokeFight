package com.example.demo.models.APIResponses.pokemonById;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Types {

    @SerializedName("type")
    private PokemonType pokemonType;

}
