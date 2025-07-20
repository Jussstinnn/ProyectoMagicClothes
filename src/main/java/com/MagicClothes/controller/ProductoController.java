package com.MagicClothes.controller;

import com.MagicClothes.domain.Producto;
import com.MagicClothes.service.ProductoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

//    @GetMapping("/productos/buscar")
//public String buscarProductos(
//    @RequestParam(required = false) String estado,
//    @RequestParam(required = false) String categoria,
//    @RequestParam(required = false) String precioRango,
//    @RequestParam(required = false) String keyword,
//    Model model) {
//
//    if ("camisas".equals(categoria)
//        && (estado == null || estado.isBlank())
//        && (precioRango == null || precioRango.isBlank())
//        && (keyword == null || keyword.isBlank())) {
//        return "redirect:/camisas";
//    }
//
//    List<Producto> productos = productoService.buscarPorFiltros(estado, categoria, precioRango);
//    model.addAttribute("productos", productos);
//    model.addAttribute("pagina", "index");
//    return "plantilla";
//}
//
//    @GetMapping("/camisas")
//    public String verCamisas(Model model) {
//        List<Producto> camisas = productoService.buscarPorFiltros(null, "camisas", null);
//        model.addAttribute("camisas", camisas);
//        model.addAttribute("pagina", "camisas");
//        return "plantilla";
//    }
}