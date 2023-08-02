package com.example.demo.models.DTOs;

import com.example.demo.models.domains.Appearance;
import com.example.demo.models.domains.Type;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
@AllArgsConstructor

public class PokemonDTO {

    @SerializedName("name")
    public String name;

    @SerializedName("appearance")
    public Appearance appearance;

    @SerializedName("baseExperience")
    public Integer baseExperience;

    @SerializedName("description")
    public String description;

    @SerializedName("evolutionLevel")
    public Integer evolutionLevel;

    @SerializedName("evolution")
    public Integer evolution;

    @SerializedName("oficialPhoto")
    public String oficialPhoto;

    @SerializedName("backPhoto")
    public String backPhoto;

    @SerializedName("frontPhoto")
    public String frontPhoto;

    @SerializedName("types")
    public List<Type> types;

}
