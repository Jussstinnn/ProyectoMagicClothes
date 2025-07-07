package com.MagicClothes.service;

import com.MagicClothes.domain.Camisas;
import java.util.List;

public interface CamisasService {
    List<Camisas> getCamisas();                   // lista de todas las camisas
    Camisas getCamisasPorId(Long id);             // camisa singular por id
    List<Camisas> obtenerRelacionadas(Long idActual); // lista camisas relacionadas (excluyendo idActual)
}