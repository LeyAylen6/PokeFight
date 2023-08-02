package com.example.demo.models.APIResponses.pokemonById;

import com.example.demo.models.APIResponses.pokemonById.OfficialPhoto;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Sprites {

    @SerializedName("back_default")
    private String backPhoto;

    @SerializedName("front_default")
    private String frontPhoto;

    @SerializedName("other")
    private OfficialPhoto officialPhoto;
}

