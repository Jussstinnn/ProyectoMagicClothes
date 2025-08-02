
package com.MagicClothes.dao;

import com.MagicClothes.domain.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface CompraRepository extends JpaRepository<Compra, Long> {
    List<Compra> findByUsuario(String usuario);
}