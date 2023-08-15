package com.ada.petbet.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@Table(name = "tb_aposta")
public class Aposta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double valor;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_apostador", referencedColumnName = "id")
    private Apostador apostador;
    private LocalDate data;

    public Aposta() {
    }

    public Apostador getApostador() {
        return apostador;
    }

    public Aposta setApostador(Apostador apostador) {
        this.apostador = apostador;
        return this;
    }
}
