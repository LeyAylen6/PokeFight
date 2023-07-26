package com.example.demo.models.domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="users")
@AllArgsConstructor
@Data
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull private Integer id;

    @Column
    @NotNull private String firsName;

    @Column
    @NotNull private String Lastname;

    @Column
    @NotNull private String password;

    @Column
    @NotNull private String email;
}
