package com.example.demo.models.APIResponses.getAppearance;

import com.example.demo.models.OptionalStringTypeAdapter;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import static java.lang.Integer.parseInt;

@Getter
@ToString
@Setter
public class IsEvolutionOf {

    @SerializedName("url")
    public String url;

    public Integer pokemonId() {
        return parseInt(url.substring(url.length() - 2, url.length() - 1));
    }
}
