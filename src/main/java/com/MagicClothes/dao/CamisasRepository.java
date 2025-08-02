package com.MagicClothes.dao;

import com.MagicClothes.domain.Camisas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CamisasRepository extends JpaRepository<Camisas, Long> {
}