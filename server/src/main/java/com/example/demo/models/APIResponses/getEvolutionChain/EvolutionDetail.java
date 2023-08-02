package com.example.demo.models.APIResponses.getEvolutionChain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class EvolutionDetail {

    @SerializedName("evolution_details")
    private List<EvolutionLevel> evolutionDetail;

    @SerializedName("species")
    private NameEvolution nameEvolution;
}
