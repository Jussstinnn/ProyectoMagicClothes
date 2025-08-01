/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.MagicClothes.service;

import com.MagicClothes.domain.Carrito;
import com.MagicClothes.domain.Producto;

public interface CarritoService {

    Carrito obtenerCarrito(String usuario);
    void agregarProducto(String usuario, Producto producto, int cantidad);
    void eliminarProducto(String usuario, Long idItem);
    void actualizarCantidad(String usuario, Long idItem, int cantidad);
    void limpiarCarrito(String usuario);
}

