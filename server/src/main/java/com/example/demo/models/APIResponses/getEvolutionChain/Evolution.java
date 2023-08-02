package com.example.demo.models.APIResponses.getEvolutionChain;

import com.example.demo.models.APIResponses.getEvolutionChain.EvolutionDetail;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class Evolution {

    @SerializedName("evolves_to")
    private List<EvolutionDetail> evolution;
}
