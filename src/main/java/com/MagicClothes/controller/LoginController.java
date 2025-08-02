package com.MagicClothes.controller;

import com.MagicClothes.domain.Usuario; 
import com.MagicClothes.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
public class LoginController {

    // Mostrar formulario de login
    @GetMapping("/login")
    public String mostrarLogin(Model model) {
        return "login"; // Vista del formulario de login (login.html)
    }
}
