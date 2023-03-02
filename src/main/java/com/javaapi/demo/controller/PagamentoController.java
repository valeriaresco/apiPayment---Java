package com.javaapi.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaapi.demo.model.Pagamento;
import com.javaapi.demo.repository.PagamentoRepository;

@RestController
public class PagamentoController {
	
	@Autowired
	private PagamentoRepository pagamentorepository;
	
	//Listando todos os pagamentos
	@GetMapping("/pagamentos")
	public List<Pagamento> show(){
		return pagamentorepository.findAll();
	}
	
	//Cadastrar os pagamentos
	@PostMapping("/pagamentos")
	public Pagamento add(@RequestBody /*@Valid*/ Pagamento pagamento) {
		return pagamentorepository.save(pagamento);
	}
	
	//Apagando um pagamento
	@DeleteMapping("/pagamentos/{id}")
	public void deletePagamento(@PathVariable Long id) {
		pagamentorepository.deleteById(id);
		
	}
	
	

}
