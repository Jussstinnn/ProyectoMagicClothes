    package com.MagicClothes.dao;

    import com.MagicClothes.domain.Usuario;
    import org.springframework.data.jpa.repository.JpaRepository;

    public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        Usuario findByCorreoElectronicoAndContrasena(String correoElectronico, String contrasena);
    }

