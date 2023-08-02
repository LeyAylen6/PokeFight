package com.example.demo.models;

import com.example.demo.models.APIResponses.getAppearance.IsEvolutionOf;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.util.Optional;

public class OptionalStringTypeAdapter extends TypeAdapter<Optional<String>> {

    @Override
    public void write(JsonWriter out, Optional<String> optionalString) throws IOException {
        if (optionalString.isPresent()) {
            out.value(optionalString.get());
        } else {
            out.nullValue();
        }
    }

    // peek mira el proximo valor el token json sin consumirlo
    // nextNull(), si el campo en el que estamos es null, continua al proximo
    @Override
    public Optional<String> read(JsonReader in) throws IOException {
        if(in.peek() == com.google.gson.stream.JsonToken.NULL) {
            in.nextNull();
            return Optional.empty();

        } else {
            String value = in.nextString();
            return Optional.ofNullable(value);
        }
    }
}
