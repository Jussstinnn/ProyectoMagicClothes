package com.MagicClothes.controller;

import com.MagicClothes.service.VestidosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VestidosController {

    @Autowired
    private VestidosService vestidosService;

    @GetMapping("/vestidos")
    public String mostrarVestidos(Model model) {
        model.addAttribute("vestidos", vestidosService.getVestidos());
        model.addAttribute("pagina", "vestidos");
        return "plantilla";
    }

    @GetMapping("/vestidos/{id}")
    public String detalleVestido(@PathVariable Long id, Model model) {
        var vestido = vestidosService.getVestidoPorId(id);
        if (vestido == null) {
            return "redirect:/error";
        }
        model.addAttribute("vestido", vestido);
        model.addAttribute("titulo", "Detalle del Vestido");
        model.addAttribute("pagina", "detallesVestido");
        return "plantilla";
    }
}

