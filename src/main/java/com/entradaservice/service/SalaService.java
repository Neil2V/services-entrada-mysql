package com.entradaservice.service;

import com.entradaservice.models.Asiento;
import com.entradaservice.models.Sala;
import com.entradaservice.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaService {

    @Autowired
    SalaRepository salaRepository;

    public void save(Sala sala){
       salaRepository.save(sala);
    }

    public List<Sala> getSalas(){
        return salaRepository.findAll();
    }







}
