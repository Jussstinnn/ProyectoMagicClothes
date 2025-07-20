/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.MagicClothes.controller;

import com.MagicClothes.domain.Producto;
import com.MagicClothes.service.CarritoService;
import com.MagicClothes.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    private CarritoService carritoService;

    @Autowired
    private ProductoService productoService;

    private String getUsuario() {
        return "usuarioDemo";
    }

    @GetMapping
    public String verCarrito(Model model) {
        var carrito = carritoService.obtenerCarrito(getUsuario());
        model.addAttribute("carrito", carrito);
        model.addAttribute("total", carrito.getTotal());
        return "carrito";
    }

    @PostMapping("/agregar")
    public String agregarProducto(@RequestParam int idProducto, @RequestParam int cantidad) {
        Producto producto = productoService.buscarPorId(idProducto).orElseThrow();
        carritoService.agregarProducto(getUsuario(), producto, cantidad);
        return "redirect:/carrito";
    }

    @PostMapping("/eliminar")
    public String eliminarProducto(@RequestParam Long idItem) {
        carritoService.eliminarProducto(getUsuario(), idItem);
        return "redirect:/carrito";
    }

    @PostMapping("/actualizar")
    public String actualizarCantidad(@RequestParam Long idItem, @RequestParam int cantidad) {
        carritoService.actualizarCantidad(getUsuario(), idItem, cantidad);
        return "redirect:/carrito";
    }
}
