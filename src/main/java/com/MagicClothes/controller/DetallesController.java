package com.MagicClothes.controller;

import com.MagicClothes.domain.Camisas;
import com.MagicClothes.service.CamisasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class DetallesController {

    @Autowired
    private CamisasService camisasService;

@GetMapping("/detalles/{id}")
public String detalleCamisa(@PathVariable("id") Long id, Model model) {
    Camisas camisa = camisasService.getCamisasPorId(id);
    if (camisa == null) {
        return "redirect:/error";
    }
    model.addAttribute("camisa", camisa);
    model.addAttribute("titulo", "Detalle de " + camisa.getNombre()); // título dinámico
    model.addAttribute("pagina", "detalles");  // indica qué fragmento incluir
    return "plantilla";  // plantilla base que incluirá el fragmento detalles.html :: body_content
}
}