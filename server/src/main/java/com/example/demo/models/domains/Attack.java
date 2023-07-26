package com.example.demo.models.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="attack")
@AllArgsConstructor
@Data
public class Attack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private Integer damage;

    @Column
    private String text;
}
