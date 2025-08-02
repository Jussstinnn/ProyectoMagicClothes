package com.MagicClothes.dao;

import com.MagicClothes.domain.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreoElectronico(String correoElectronico);
   // Usuario findByCorreoElectronico(String correoElectronico);
    
}

