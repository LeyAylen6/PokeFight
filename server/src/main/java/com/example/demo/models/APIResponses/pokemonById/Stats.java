package com.example.demo.models.APIResponses.pokemonById;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@ToString
public class Stats {

    @SerializedName("base_stat")
    public Integer hp;
}
