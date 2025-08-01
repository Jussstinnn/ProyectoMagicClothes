package com.MagicClothes.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPago;

    private double monto;

    @Enumerated(EnumType.STRING)
    private MetodoPago metodoPago;

    private String numeroTarjeta;
    private String fechaExpiracion;
    private String cvv;

    @Column(name = "fecha_pago")
    private LocalDateTime fechaPago;

    public enum MetodoPago {
        TARJETA_CREDITO,
        TARJETA_DEBITO
    }

    @PrePersist
    public void asignarFechaPago() {
        this.fechaPago = LocalDateTime.now();
    }
}



