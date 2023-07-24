package com.example.demo.models.APIResponses;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@ToString
public class Photo {

    @SerializedName("front_default")
    public String frontDefault;

}
