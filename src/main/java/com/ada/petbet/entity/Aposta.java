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
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_apostador", referencedColumnName = "id", insertable = false, updatable = false)
    private Apostador apostador;

    private LocalDate data;

    public Aposta(Apostador apostador) {
        this.apostador = apostador;
    }

    public void setApostador(Apostador apostador) {
        this.apostador=apostador;
    }
}
