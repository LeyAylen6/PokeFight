package com.example.demo.models.domains;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name="figth")
@AllArgsConstructor
@Data
public class Figth {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id", insertable=false, updatable=false)
    private User userIdOne;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="user_id", insertable=false, updatable=false)
    private User userIdTwo;

    @Column
    private Integer winner;
}
