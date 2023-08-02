package com.example.demo.models.APIResponses.getEvolutionChain;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetEvolutionChain {

    @SerializedName("chain")
    public Evolution evolution;

}
