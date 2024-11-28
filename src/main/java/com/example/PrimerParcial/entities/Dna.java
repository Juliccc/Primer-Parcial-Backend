package com.example.PrimerParcial.entities;

import jakarta.persistence.*;
import lombok.*;
import java.io.Serializable;

@Entity
@Table(name = "individuo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Dna extends Base implements Serializable {
    @Column(name = "dna")
    private String dna;

    @Column(name = "isMutant")
    private boolean isMutant;
}
