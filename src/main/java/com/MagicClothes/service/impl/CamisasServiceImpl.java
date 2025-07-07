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
        // Mejor usar Optional para manejar ausencia
        return camisasRepository.findById(id).orElse(null);
    }

    @Override
    public List<Camisas> obtenerRelacionadas(Long idActual) {
        // Aquí validaría que idActual no sea null para evitar errores
        if (idActual == null) {
            // Podrías devolver todas las camisas o una lista vacía según la lógica de negocio
            return camisasRepository.findAll();
        }
        return camisasRepository.findTop3ByIdNot(idActual);
    }
}