package com.example.demo.models.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="pokemonUser")
@AllArgsConstructor
@Data
public class Pokemon_User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("pokemon_id")
    @JoinColumn(name="pokemonId")
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @MapsId("pokemon_id")
    @JoinColumn(name="pokemonId", nullable=false)
    private Pokemon pokemon;

    @Column
    private Integer level;

    @Column
    private Integer experience;

}
