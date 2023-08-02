package com.example.demo.models.APIResponses;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@ToString
public class OfficialPhoto {

    @SerializedName("official-artwork")
    public Photo photo;

}
