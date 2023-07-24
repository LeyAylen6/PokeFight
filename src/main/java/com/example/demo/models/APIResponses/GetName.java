package com.example.demo.models.APIResponses;

import com.google.gson.annotations.SerializedName;
import lombok.*;

@Getter
@ToString

public class GetName {

    @SerializedName("name")
    public String name;

    @SerializedName("url")
    public String url;
}
