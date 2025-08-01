/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.MagicClothes.service;

import com.MagicClothes.domain.Producto;
import java.util.List;
import java.util.Optional;

public interface ProductoService {
    List<Producto> listarProductos();
    Optional<Producto> buscarPorId(Integer id);
}
