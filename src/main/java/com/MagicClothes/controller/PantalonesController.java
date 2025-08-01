package com.MagicClothes.controller;

import com.MagicClothes.service.PantalonService;
import com.MagicClothes.domain.Pantalon;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/pantalones")
public class PantalonesController {

    @Autowired
    private PantalonService pantalonService;

    @GetMapping
    public String mostrarPantalones(Model model) {
        List<Pantalon> pantalones = pantalonService.getPantalones();
        model.addAttribute("pantalones", pantalones);
        model.addAttribute("pagina", "pantalones"); 
        return "plantilla"; 
    }




    @GetMapping("/{id}")
    public String detallePantalon(@PathVariable("id") Long id, Model model) {
        Pantalon pantalon = pantalonService.getPantalonPorId(id);
        if (pantalon == null) return "redirect:/error";

        model.addAttribute("pantalon", pantalon);
        model.addAttribute("titulo", "Detalle de " + pantalon.getNombre());
        model.addAttribute("otrosPantalones", pantalonService.obtenerRelacionados(id));
        model.addAttribute("pagina", "detallePantalon");
        return "plantilla";
    }
}

