package com.entradaservice.controller;

import com.entradaservice.models.Asiento;
import com.entradaservice.models.Sala;
import com.entradaservice.service.AsientoService;
import com.entradaservice.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entrada")
@CrossOrigin("*")
public class BoletoController {



    @Autowired
    private SalaService salaService;

      @Autowired
      private AsientoService asientoService;
/*
    @PostMapping("/create")
    public ResponseEntity<?> save(@RequestBody Boleto boleto){

       // return ResponseEntity.status(HttpStatus.CREATED).body(boletoService.saveEntrada(boletoo));
    }*/
    @GetMapping("/asientos")
    public ResponseEntity<List<Asiento>> AllAsientos(){
        List<Asiento> asientos = asientoService.getAsientos();
        return ResponseEntity.ok(asientos);
    }

    @GetMapping("/salas")
    public ResponseEntity<List<Sala>> AllSalas(){
        List<Sala> salas = salaService.getSalas();
        return ResponseEntity.ok(salas);
    }



}
