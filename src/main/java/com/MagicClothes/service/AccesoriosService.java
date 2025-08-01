package com.MagicClothes.service;

import com.MagicClothes.domain.Accesorios;

import java.util.List;

public interface AccesoriosService {
    List<Accesorios> listarAccesorios();
    Accesorios buscarPorId(Long id);
}

