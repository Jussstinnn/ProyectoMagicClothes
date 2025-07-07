package com.MagicClothes.controller;

import com.MagicClothes.domain.Camisas;
import com.MagicClothes.service.CamisasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/detalles")
public class DetallesController {

    @Autowired
    private CamisasService camisasService;

    @GetMapping("/{id}")
    public String detalleCamisa(@PathVariable("id") Long id, Model model) {
        Camisas camisa = camisasService.getCamisasPorId(id);
        if (camisa == null) {
            return "redirect:/error";
        }

        model.addAttribute("camisa", camisa);  // corregido aquí
        model.addAttribute("titulo", "Detalle de " + camisa.getNombre());  // y aquí

        List<Camisas> otrasCamisas = camisasService.obtenerRelacionadas(id);
        model.addAttribute("otrasCamisas", otrasCamisas);

        model.addAttribute("pagina", "detalles");
        return "plantilla";
    }
}