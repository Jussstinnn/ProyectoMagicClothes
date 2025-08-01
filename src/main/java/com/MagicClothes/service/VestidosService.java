package com.MagicClothes.service;

import com.MagicClothes.domain.Vestidos;
import java.util.List;

public interface VestidosService {
    List<Vestidos> getVestidos();
    Vestidos getVestidoPorId(Long id);
}

