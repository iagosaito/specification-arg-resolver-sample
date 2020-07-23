package com.rbasistemas.specargresolver.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "player")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public class Player {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    @Column
    private Long playerId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    private int age;

    @Enumerated(EnumType.STRING)
    private Position positionField;

    @ManyToOne
    private Club club;
}
