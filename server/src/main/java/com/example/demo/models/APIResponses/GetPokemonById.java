package com.example.demo.models.APIResponses;

import com.example.demo.models.domains.Attack;
import com.example.demo.models.domains.Type;
import com.google.gson.annotations.SerializedName;
import lombok.*;

import java.util.List;

@Getter
@ToString
public class GetPokemonById {

    @SerializedName("name")
    public String name;

//    @SerializedName("appearance")
//    public Appearance appearance;

    @SerializedName("base_experience")
    public Integer baseExperience;
    
    @SerializedName("stats")
    public List<Stats> stats;

//    @SerializedName("description")
//    public String description;

//    @SerializedName("evolutionLevel")
//    public Integer evolutionLevel;
//
//    @SerializedName("evolution")
//    public Integer evolution;

    @SerializedName("sprites")  // Fotos
    public Sprites sprites;

//    @SerializedName("abilities")
//    public List<Attack> attacks;
//
//    @SerializedName("types")
//    public List<Type> types;

}
