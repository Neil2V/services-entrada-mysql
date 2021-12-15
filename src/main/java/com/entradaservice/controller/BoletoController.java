package com.entradaservice.controller;

import com.entradaservice.models.Boleto;
import com.entradaservice.models.Sala;
import com.entradaservice.models.User;
import com.entradaservice.service.BoletoService;
import com.entradaservice.service.SalaService;
import com.entradaservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/entrada")
@CrossOrigin("*")
public class BoletoController {

    @Autowired
    private BoletoService boletoService;

    @Autowired
    private SalaService salaService;

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<?> save(@RequestBody Boleto boleto){
        //Boleto boletoo = new Boleto();
        Sala sala = new Sala(boleto.getSala().getNumeroSala(),boleto.getSala().getNumeroAsiento());
        User user = new User(boleto.getUser().getDni());
        //boletoo.setSala(sala);
        //boletoo.setUser(user);
        Boleto boletoo = new Boleto(user,sala);

        salaService.save(sala);
        userService.save(user);//hola
        return ResponseEntity.status(HttpStatus.CREATED).body(boletoService.saveEntrada(boletoo));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable("id") Long id){
        Optional<Boleto> boleto = boletoService.findBoletoById(id);

        if(!boleto.isPresent())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(boleto);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody Boleto boleto){
        Optional<Boleto> oboleto = boletoService.findBoletoById(id);

        if(!oboleto.isPresent())
            return ResponseEntity.notFound().build();

        oboleto.get().setUser(boleto.getUser());
        oboleto.get().setSala(boleto.getSala());

        return ResponseEntity.status(HttpStatus.CREATED).body(boletoService.saveEntrada(oboleto.get()));

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id){
        if(!boletoService.findBoletoById(id).isPresent())
            return ResponseEntity.notFound().build();
        boletoService.deleteBoleto(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/")
    public ResponseEntity<List<Boleto>> All(){
        List<Boleto> boletos = boletoService.getBoletos();
        return ResponseEntity.ok(boletos);
    }
}
