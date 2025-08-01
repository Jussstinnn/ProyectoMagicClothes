package com.MagicClothes.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
public class Camisas implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private double precio;
    private Double precioAnterior;
    private String imagen;

    private String categoria; // ← NUEVO CAMPO
}
