package com.MagicClothes.controller;

import com.MagicClothes.domain.Compra;
import com.MagicClothes.domain.Usuario;
import com.MagicClothes.service.CompraService;
import com.MagicClothes.service.UsuarioService;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Controlador para mostrar el historial de compras del usuario autenticado.
 */
@Controller
public class CompraController {

    private final CompraService compraService;
    private final UsuarioService usuarioService;

    public CompraController(CompraService compraService, UsuarioService usuarioService) {
        this.compraService = compraService;
        this.usuarioService = usuarioService;
    }

    @GetMapping("/historialCompra")
    public String verHistorialCompras(Model model, Authentication authentication) {
        if (authentication == null || !authentication.isAuthenticated()) {
            return "redirect:/login";
        }

        String correoUsuario = authentication.getName();

        Usuario usuario = usuarioService.buscarPorCorreo(correoUsuario);
        if (usuario == null) {
            return "redirect:/login";
        }

        List<Compra> compras = compraService.obtenerComprasPorUsuario(correoUsuario);

        model.addAttribute("compras", compras);
        model.addAttribute("usuario", usuario);

        return "historialCompra";  // nombre de la plantilla Thymeleaf
    }
}