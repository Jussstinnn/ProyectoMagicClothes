package com.MagicClothes.service.impl;

import com.MagicClothes.dao.CamisasRepository;
import com.MagicClothes.domain.Camisas;
import com.MagicClothes.service.CamisasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CamisasServiceImpl implements CamisasService {

    @Autowired
    private CamisasRepository camisasRepository;

    @Override
    public List<Camisas> getCamisas() {
        return camisasRepository.findAll();
    }

    @Override
    public Camisas getCamisasPorId(Long id) {
        return camisasRepository.findById(id).orElse(null);
    }

    @Override
    public List<Camisas> obtenerRelacionadas(Long id) {
        Camisas camisa = camisasRepository.findById(id).orElse(null);
        if (camisa == null || camisa.getCategoria() == null) {
            return List.of();
        }
        return camisasRepository.findByCategoriaAndIdNot(camisa.getCategoria(), id);
    }
}
