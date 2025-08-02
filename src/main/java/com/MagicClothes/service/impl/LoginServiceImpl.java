package com.MagicClothes.service.impl;

import com.MagicClothes.dao.UsuarioRepository;
import com.MagicClothes.domain.Usuario;
import com.MagicClothes.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public boolean autenticar(String correo, String contrasena) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByCorreoElectronico(correo);

        if (optionalUsuario.isPresent()) {
            Usuario usuario = optionalUsuario.get();
            // Compara la contraseña en texto plano con la encriptada
            return passwordEncoder.matches(contrasena, usuario.getContrasena());
        }

        return false;
    }
}