package com.MagicClothes.controller;

import com.MagicClothes.domain.Camisas;
import com.MagicClothes.service.CamisasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/camisas")  
public class CamisasController {

    @Autowired
    private CamisasService camisasService;

  
    @GetMapping
    public String mostrarCamisas(Model model) {
        model.addAttribute("camisas", camisasService.getCamisas());
        model.addAttribute("pagina", "camisas");
        return "plantilla";
    }


}