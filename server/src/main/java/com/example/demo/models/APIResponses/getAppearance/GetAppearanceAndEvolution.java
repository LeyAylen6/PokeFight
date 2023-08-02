package com.example.demo.models.APIResponses.getAppearance;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class GetAppearanceAndEvolution {

    @SerializedName("capture_rate")
    public Integer captureRate;

    @SerializedName("is_legendary")
    public Boolean isLegendary;

    @SerializedName("is_mythical")
    public Boolean isMythical;

    @SerializedName("evolves_from_species")
    public IsEvolutionOf isEvolutionOf;
}
