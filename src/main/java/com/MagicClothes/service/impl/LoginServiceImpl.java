package com.MagicClothes.service.impl;

import com.MagicClothes.dao.UsuarioRepository;
import com.MagicClothes.domain.Usuario;
import com.MagicClothes.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public boolean autenticar(String correo, String contrasena) {
        Usuario usuario = usuarioRepository.findByCorreoElectronicoAndContrasena(correo, contrasena);
        return usuario != null;
    }
}





