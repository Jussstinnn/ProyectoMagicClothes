package com.MagicClothes.dao;

import com.MagicClothes.domain.Pantalon;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface PantalonRepository extends JpaRepository<Pantalon, Long> {
    List<Pantalon> findByCategoriaAndIdNot(String categoria, Long id);
}

