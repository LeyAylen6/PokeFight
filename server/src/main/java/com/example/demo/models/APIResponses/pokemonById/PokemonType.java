package com.example.demo.models.APIResponses;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@ToString
public class PokemonType {

    @SerializedName("name")
    private String name;

}
