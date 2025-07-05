package com.MagicClothes.controller;

import com.MagicClothes.domain.Camisas;
import com.MagicClothes.service.CamisasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CamisasController {

    @Autowired
    private CamisasService camisasService;

    // Mostrar listado de camisas
    @GetMapping("/camisas")
    public String mostrarCamisas(Model model) {
        model.addAttribute("camisas", camisasService.getCamisas());
        model.addAttribute("pagina", "camisas");
        return "plantilla";  // nombre de la plantilla para el listado
    }

}