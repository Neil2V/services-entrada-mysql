package com.entradaservice.repository;

import com.entradaservice.models.Boleto;
import com.entradaservice.models.Boleto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoletoRepository extends JpaRepository<Boleto, Long> {
}
