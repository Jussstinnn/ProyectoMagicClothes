package com.MagicClothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

   @GetMapping("/")
   public String mostrarIndex(Model model) {
       model.addAttribute("pagina", "index");       // Fragmento a insertar
       model.addAttribute("titulo", "Magic Clothes");  // Título dinámico
       return "plantilla";                          // plantilla base Thymeleaf
   }

   @GetMapping("/oferta-mujer")
public String mostrarOfertaMujer() {
    return "oferta-mujer"; 
}

}