package com.MagicClothes.service.impl;

import com.MagicClothes.domain.Usuario;
import com.MagicClothes.service.UsuarioService;
import com.MagicClothes.dao.UsuarioRepository;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UserDetailsService, UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByCorreoElectronico(email)
            .orElseThrow(() -> new UsernameNotFoundException("Usuario no encontrado con email: " + email));

        return new User(
            usuario.getCorreoElectronico(),
            usuario.getContrasena(),
            List.of(new SimpleGrantedAuthority("ROLE_USER"))
        );
    }
    @Override
public void guardarUsuario(Usuario usuario) {
    usuarioRepository.save(usuario);
}

@Override
public Usuario buscarPorCorreo(String correo) {
    return usuarioRepository.findByCorreoElectronico(correo)
        .orElse(null); // o lanzar excepción si prefieres
}
}