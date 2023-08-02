package com.example.demo.models.APIResponses;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Getter
@ToString
public class GetPokemonById {

    @SerializedName("name")
    public String name;

    @SerializedName("capture_rate")
    public Integer captureRate;

    @SerializedName("is_legendary")
    public Boolean isLegendary;

    @SerializedName("is_mythical")
    public Boolean isMythical;

    @SerializedName("base_experience")
    public Integer baseExperience;
    
    @SerializedName("stats")
    public List<Stats> stats;

    @SerializedName("chain")
    public Evolution evolution;

    @SerializedName("sprites")
    public Sprites sprites;

    @SerializedName("types")
    public List<Types> types;

}
