package com.MagicClothes.service;

import com.MagicClothes.domain.Camisas;
import java.util.List;

public interface CamisasService {
    List<Camisas> getCamisas();
    Camisas getCamisasPorId(Long id);
}