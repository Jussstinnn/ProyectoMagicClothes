package com.MagicClothes.controller;

import com.MagicClothes.domain.Usuario; 
import com.MagicClothes.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    // Mostrar formulario de login
    @GetMapping("/login")
    public String mostrarLogin(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "login";
    }

    // Procesar login
    @PostMapping("/login")
    public String procesarLogin(@ModelAttribute("usuario") Usuario usuario, Model model) {
        boolean autenticado = loginService.autenticar(usuario.getCorreoElectronico(), usuario.getContrasena());

        if (autenticado) {
            return "redirect:/"; // Redirige a la página principal si el login es exitoso
        } else {
            model.addAttribute("error", "Correo o contraseña incorrectos.");
            model.addAttribute("usuario", new Usuario());
            return "login";
        }
    }
}





