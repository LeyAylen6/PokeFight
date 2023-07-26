package com.example.demo.models.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="pack")
@AllArgsConstructor
@Data
public class Pack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    Integer price;

    @Column
    String color;

    @Column
    Integer initialPokemon;

    @Column
    Integer normalPokemon;

    @Column
    Integer singularPokemon;

    @Column
    Integer legendaryPokemon;
}
