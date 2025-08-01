package com.MagicClothes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InicioController {

   @GetMapping("/")
public String mostrarIndex(Model model) {
    model.addAttribute("pagina", "index");
    return "plantilla";
}
@GetMapping("/oferta-mujer")
public String mostrarOfertaMujer() {
    return "oferta-mujer"; 
}


}


