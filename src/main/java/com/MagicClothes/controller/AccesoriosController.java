package com.MagicClothes.controller;

import com.MagicClothes.domain.Accesorios;
import com.MagicClothes.service.AccesoriosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AccesoriosController {

    @Autowired
    private AccesoriosService accesoriosService;

    // Mostrar todos los accesorios
    @GetMapping("/accesorios")
    public String mostrarAccesorios(Model model) {
        List<Accesorios> accesorios = accesoriosService.listarAccesorios();
        model.addAttribute("accesorios", accesorios);
        model.addAttribute("pagina", "accesorios");
        return "plantilla";
    }

    // Mostrar detalle de un accesorio
    @GetMapping("/detallesAccesorios/{id}")
    public String mostrarDetalleAccesorio(@PathVariable Long id, Model model) {
        Accesorios accesorio = accesoriosService.buscarPorId(id); 

        if (accesorio == null) {
            return "redirect:/error"; 
        }

        model.addAttribute("accesorio", accesorio);
        model.addAttribute("titulo", accesorio.getNombre());
        model.addAttribute("pagina", "detallesAccesorios");
        return "plantilla";
    }
}


