package com.MagicClothes.service;

import com.MagicClothes.domain.Pago;
import java.util.Optional;

public interface PagoService {
    
    Pago procesarPago(Pago pago);
    
    Optional<Pago> buscarPorId(int id);
}


