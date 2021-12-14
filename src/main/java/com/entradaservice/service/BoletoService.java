package com.entradaservice.service;

import com.entradaservice.repository.BoletoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoletoService {

    @Autowired
    private BoletoRepository boletoRepository;



}
