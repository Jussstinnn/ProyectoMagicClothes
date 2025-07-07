package com.MagicClothes.dao;

import com.MagicClothes.domain.Camisas;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CamisasRepository extends JpaRepository<Camisas, Long> {
    List<Camisas> findTop3ByIdNot(Long id);

}
