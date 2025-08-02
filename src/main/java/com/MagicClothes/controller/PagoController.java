package com.MagicClothes.controller;

import com.MagicClothes.domain.Pago;
import com.MagicClothes.service.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;


@Controller
public class PagoController {

    @Autowired
    private PagoService pagoService;

    @GetMapping("/pago")
    public String mostrarFormularioPago(Model model) {
        model.addAttribute("pago", new Pago());
        return "pago";
    }

  @PostMapping("/pago")
public String procesarPago(@ModelAttribute("pago") Pago pago, Model model) {
    try {
        Pago pagoGuardado = pagoService.procesarPago(pago); 
        return "redirect:/comprobante?pagoId=" + pagoGuardado.getIdPago();  
    } catch (Exception e) {
        model.addAttribute("error", "Error al procesar el pago: " + e.getMessage());
        return "pago";
    }
}
    
    @GetMapping("/comprobante")
public String mostrarComprobante(Model model, @RequestParam int pagoId) {
    Optional<Pago> pagoOpt = pagoService.buscarPorId(pagoId);

    if (pagoOpt.isPresent()) {
        Pago pago = pagoOpt.get();
        model.addAttribute("pago", pago);
        return "comprobante";
    } else {
        model.addAttribute("error", "Pago no encontrado.");
        return "error"; 
    }
}


}


