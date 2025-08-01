package com.MagicClothes.service.impl;

import com.MagicClothes.dao.AccesoriosRepository;
import com.MagicClothes.domain.Accesorios;
import com.MagicClothes.service.AccesoriosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccesoriosServiceImpl implements AccesoriosService {

    @Autowired
    private AccesoriosRepository accesoriosRepository;

    @Override
    public List<Accesorios> listarAccesorios() {
        return accesoriosRepository.findAll();
    }

    @Override
    public Accesorios buscarPorId(Long id) {
        return accesoriosRepository.findById(id).orElse(null);
    }
}
