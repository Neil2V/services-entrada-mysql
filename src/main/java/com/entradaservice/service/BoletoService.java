package com.entradaservice.service;

import com.entradaservice.models.Boleto;
import com.entradaservice.repository.BoletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoletoService {

    @Autowired
    private BoletoRepository boletoRepository;

    public Boleto saveEntrada(Boleto boleto){
        return boletoRepository.save(boleto);
    }

    public Optional<Boleto> findBoletoById(Long id){
        return boletoRepository.findById(id);
    }

    public void deleteBoleto(Long id){
        boletoRepository.deleteById(id);
    }

    public List<Boleto> getBoletos(){
        return boletoRepository.findAll();
    }

}
