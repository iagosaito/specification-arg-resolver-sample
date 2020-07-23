package com.rbasistemas.specargresolver.domain.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "club")
@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Club {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column @EqualsAndHashCode.Include
    private Long clubId;

    @Column
    private String name;

    @Column
    private LocalDate fundationDate;

    @Column
    private int division;
}
