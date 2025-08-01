package com.MagicClothes.service.impl;

import com.MagicClothes.dao.PantalonRepository;
import com.MagicClothes.domain.Pantalon;
import com.MagicClothes.service.PantalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PantalonServiceImpl implements PantalonService {

    @Autowired
    private PantalonRepository pantalonRepository;

    @Override
    public List<Pantalon> getPantalones() {
        return pantalonRepository.findAll();
    }

    @Override
    public Pantalon getPantalonPorId(Long id) {
        return pantalonRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pantalon> obtenerRelacionados(Long id) {
        Pantalon pantalon = pantalonRepository.findById(id).orElse(null);
        if (pantalon == null || pantalon.getCategoria() == null) {
            return List.of();
        }
        return pantalonRepository.findByCategoriaAndIdNot(pantalon.getCategoria(), id);
    }
}

