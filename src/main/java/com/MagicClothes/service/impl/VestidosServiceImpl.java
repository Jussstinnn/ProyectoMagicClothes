package com.MagicClothes.service.impl;

import com.MagicClothes.dao.VestidosRepository;
import com.MagicClothes.domain.Vestidos;
import com.MagicClothes.service.VestidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VestidosServiceImpl implements VestidosService {

    @Autowired
    private VestidosRepository vestidosRepository;

    @Override
    public List<Vestidos> getVestidos() {
        return vestidosRepository.findAll();
    }

    @Override
    public Vestidos getVestidoPorId(Long id) {
        return vestidosRepository.findById(id).orElse(null);
    }
}
