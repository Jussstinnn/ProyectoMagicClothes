
package com.MagicClothes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

import java.time.LocalDate;
@Entity
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String producto;
    private double monto;
    private LocalDate fecha;
    private String estado; // Ej: Entregado, En proceso, Cancelado

    private String usuario; // nombre o email del usuario comprador
    // Getters
    public Long getId() {
        return id;
    }

    public String getProducto() {
        return producto;
    }

    public double getMonto() {
        return monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public String getUsuario() {
        return usuario;
    }

    // Setters (opcionales si usas solo para lectura Thymeleaf)
    public void setId(Long id) {
        this.id = id;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}

