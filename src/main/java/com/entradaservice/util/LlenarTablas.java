package com.entradaservice.util;

import com.entradaservice.models.Asiento;
import com.entradaservice.models.Sala;
import com.entradaservice.service.AsientoService;
import com.entradaservice.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class LlenarTablas implements CommandLineRunner{

    @Autowired
    SalaService salaService;

    @Autowired
    AsientoService asientoService;

    @Override
    public void run(String... args) throws Exception {

        Sala sala1 = new Sala(1);
        Sala sala2 = new Sala(2);
        Sala sala3 = new Sala(3);
        Asiento asiento1 = new Asiento( 1, false);
        Asiento asiento2 = new Asiento( 2, false);
        Asiento asiento3 = new Asiento(1, false);
        Asiento asiento4 = new Asiento(2, false);
        Asiento asiento5 = new Asiento(1, false);
        Asiento asiento6 = new Asiento(2, false);


        asiento1.setSala(sala1);
        asiento2.setSala(sala2);
        asiento3.setSala(sala1);
        asiento4.setSala(sala2);
        asiento5.setSala(sala1);
        asiento6.setSala(sala2);


        Set<Asiento> asientosSala1 = new HashSet<>();
        Set<Asiento> asientosSala2 = new HashSet<>();
        Set<Asiento> asientosSala3 = new HashSet<>();

        asientosSala1.add(asiento1);
        asientosSala1.add(asiento2);
        asientosSala2.add(asiento3);
        asientosSala2.add(asiento4);
        asientosSala3.add(asiento5);
        asientosSala3.add(asiento6);

        sala1.setAsientos(asientosSala1);
        sala2.setAsientos(asientosSala2);
        sala3.setAsientos(asientosSala3);

        salaService.save(sala1);
        salaService.save(sala2);
        salaService.save(sala3);

        asientoService.save(asiento1);
        asientoService.save(asiento2);
        asientoService.save(asiento3);
        asientoService.save(asiento4);
        asientoService.save(asiento5);
        asientoService.save(asiento6);


    }
}
