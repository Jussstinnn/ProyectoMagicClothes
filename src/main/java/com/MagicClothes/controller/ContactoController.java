
package com.MagicClothes.controller;

import com.MagicClothes.domain.Contacto;
import com.MagicClothes.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ContactoController {

    @Autowired
    private ContactoService contactoService;

    @GetMapping("/contacto")
public String mostrarFormulario(Model model) {
    model.addAttribute("contacto", new Contacto());
    model.addAttribute("pagina", "contacto");
    return "contacto";
}

    @PostMapping("/contacto")
    public String procesarFormulario(@ModelAttribute Contacto contacto,
                                     RedirectAttributes redirectAttributes) {
        contactoService.guardarContacto(contacto);
        redirectAttributes.addFlashAttribute("mensaje", "¡Gracias por tu consulta!");
        return "redirect:/contacto";
    }
}
