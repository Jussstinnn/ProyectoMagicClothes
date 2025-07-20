package com.MagicClothes.controller;

import com.MagicClothes.domain.Camisas;
import com.MagicClothes.service.CamisasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class CamisasController {

    @Autowired
    private CamisasService camisasService;

    @GetMapping("/camisas")
    public String mostrarCamisas(Model model) {
        model.addAttribute("camisas", camisasService.getCamisas());
        model.addAttribute("pagina", "camisas");
        return "plantilla";
    }

    @GetMapping("/camisas/buscar")
    public String buscarCamisas(@RequestParam(required = false) String keyword, Model model) {
        List<Camisas> resultado = camisasService.buscarPorNombre(keyword);
        model.addAttribute("camisas", resultado);
        model.addAttribute("pagina", "camisas");
        return "plantilla";
    }
}