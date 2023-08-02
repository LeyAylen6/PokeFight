package com.example.demo.models.domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Entity
@Table(name="pokemon")
@AllArgsConstructor
@Data
@Builder
public class Pokemon {

    @Id
    @Column(name = "pokemonId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    @NotNull private String name;

    @Column
    @NotNull private Appearance appearance;

    @Column
    @NotNull private Integer baseExperience;

    @Column
    @NotNull private Integer hp;

    @Column
    private Integer evolutionLevel;

    @Column
    private Integer evolution;

    @Column
    @NotNull private String oficialPhoto;

    @Column
    @NotNull private String backPhoto;

    @Column
    @NotNull private String frontPhoto;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "pokemon_type",
            joinColumns = @JoinColumn(name = "type_id"),
            inverseJoinColumns = @JoinColumn(name = "pokemon_id"))
    private List<Type> types;
}
