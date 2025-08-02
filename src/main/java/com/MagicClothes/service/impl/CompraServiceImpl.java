/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.MagicClothes.service.impl;

import com.MagicClothes.dao.CompraRepository;
import com.MagicClothes.domain.Compra;
import com.MagicClothes.service.CompraService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompraServiceImpl implements CompraService {

    private final CompraRepository compraRepository;

    public CompraServiceImpl(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @Override
    public List<Compra> obtenerComprasPorUsuario(String usuario) {
        return compraRepository.findByUsuario(usuario);
    }
}