package com.MagicClothes.service;

import com.MagicClothes.domain.Pantalon;
import java.util.List;

public interface PantalonService {
    List<Pantalon> getPantalones();
    Pantalon getPantalonPorId(Long id);
    List<Pantalon> obtenerRelacionados(Long id);
}

