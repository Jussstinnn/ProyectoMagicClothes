
package com.MagicClothes.service.impl;

import com.MagicClothes.dao.ContactoRepository;
import com.MagicClothes.domain.Contacto;
import com.MagicClothes.service.ContactoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoServiceImpl implements ContactoService {

    @Autowired
    private ContactoRepository contactoRepository;

    @Override
    public void guardarContacto(Contacto contacto) {
        contactoRepository.save(contacto);
    }
}