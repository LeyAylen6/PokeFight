package com.example.demo.models.APIResponses.getEvolutionChain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class EvolutionLevel {

    @SerializedName("min_level")
    private Integer EvolutionLevel;

//    @SerializedName("min_level")
//    private Integer secondEvolutionLevel;
}
