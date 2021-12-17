package com.entradaservice.service;

import com.entradaservice.models.Asiento;
import com.entradaservice.repository.AsientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsientoService {

    @Autowired
    AsientoRepository asientoRepository;

    public List<Asiento> getAsientos(){
        return asientoRepository.findAll();
    }

    public void save (Asiento asiento){
        asientoRepository.save(asiento);
    }


}
