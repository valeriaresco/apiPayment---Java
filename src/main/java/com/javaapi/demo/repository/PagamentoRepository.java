package com.javaapi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaapi.demo.model.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
