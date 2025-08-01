package com.MagicClothes.dao;

import com.MagicClothes.domain.Camisas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamisasRepository extends JpaRepository<Camisas, Long> {
    List<Camisas> findByCategoriaAndIdNot(String categoria, Long id);
}
