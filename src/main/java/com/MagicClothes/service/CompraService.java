/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.MagicClothes.service;

import com.MagicClothes.domain.Compra;
import java.util.List;

public interface CompraService {
    List<Compra> obtenerComprasPorUsuario(String usuario);
}