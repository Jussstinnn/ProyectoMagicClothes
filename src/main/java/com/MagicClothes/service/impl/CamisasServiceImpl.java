package com.MagicClothes.service;

import com.MagicClothes.dao.CamisasRepository;
import com.MagicClothes.domain.Camisas;
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
}