/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.MagicClothes.service.impl;

import com.MagicClothes.dao.CarritoItemRepository;
import com.MagicClothes.dao.CarritoRepository;
import com.MagicClothes.domain.Carrito;
import com.MagicClothes.domain.CarritoItem;
import com.MagicClothes.domain.Producto;
import com.MagicClothes.service.CarritoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarritoServiceImpl implements CarritoService {

    @Autowired
    private CarritoRepository carritoRepository;

    @Autowired
    private CarritoItemRepository carritoItemRepository;

    @Override
    public Carrito obtenerCarrito(String usuario) {
        return carritoRepository.findByUsuario(usuario)
                .orElseGet(() -> {
                    Carrito nuevo = new Carrito();
                    nuevo.setUsuario(usuario);
                    return carritoRepository.save(nuevo);
                });
    }

    @Override
    public void agregarProducto(String usuario, Producto producto, int cantidad) {
        Carrito carrito = obtenerCarrito(usuario);

        for (CarritoItem item : carrito.getItems()) {
            if (item.getProducto().getIdProducto().equals(producto.getIdProducto())) {
                item.setCantidad(item.getCantidad() + cantidad);
                carritoRepository.save(carrito);
                return;
            }
        }

        CarritoItem nuevoItem = new CarritoItem();
        nuevoItem.setProducto(producto);
        nuevoItem.setCantidad(cantidad);
        nuevoItem.setCarrito(carrito);
        carrito.getItems().add(nuevoItem);

        carritoRepository.save(carrito);
    }

    @Override
    public void eliminarProducto(String usuario, Long idItem) {
        carritoItemRepository.deleteById(idItem);
    }

    @Override
    public void actualizarCantidad(String usuario, Long idItem, int cantidad) {
        Optional<CarritoItem> itemOpt = carritoItemRepository.findById(idItem);
        itemOpt.ifPresent(item -> {
            item.setCantidad(cantidad);
            carritoItemRepository.save(item);
        });
    }

    @Override
    public void limpiarCarrito(String usuario) {
        Carrito carrito = obtenerCarrito(usuario);
        carrito.getItems().clear();
        carritoRepository.save(carrito);
    }
}
