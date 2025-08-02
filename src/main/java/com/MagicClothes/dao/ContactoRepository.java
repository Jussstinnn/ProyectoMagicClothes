
package com.MagicClothes.dao;

import com.MagicClothes.domain.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ContactoRepository extends JpaRepository<Contacto, Long> {

}