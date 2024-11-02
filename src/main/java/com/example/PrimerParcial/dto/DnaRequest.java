package com.example.PrimerParcial.dto;

import lombok.Getter;
import lombok.Setter;
import com.example.PrimerParcial.validators.ValidDna;

@Getter
@Setter
public class DnaRequest {
    @ValidDna
    private String[] dna;
}
