package com.MagicClothes.service.impl;

import com.MagicClothes.dao.PagoRepository;
import com.MagicClothes.domain.Pago;
import com.MagicClothes.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class PagoServiceImpl implements PagoService {

    @Autowired
    private PagoRepository pagoRepository;

    @Override
    public Pago procesarPago(Pago pago) {
        if (pago.getMetodoPago() == null || pago.getMonto() <= 0) {
            throw new IllegalArgumentException("Datos de pago inválidos");
        }
        return pagoRepository.save(pago);
    }
      @Override
    public Optional<Pago> buscarPorId(int idPago) {
        return pagoRepository.findById(idPago);
    }
}




