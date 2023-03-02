package com.javaapi.demo.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaapi.demo.model.Pagamento;
import com.javaapi.demo.repository.DeleteRepository;
import com.javaapi.demo.repository.FiltersRepository;
import com.javaapi.demo.repository.PagamentoRepository;

@RestController
public class PagamentoController {
	
	@Autowired
	private PagamentoRepository pagamentorepository;
	@Autowired
	private DeleteRepository deleteRepository;
	@Autowired
	private FiltersRepository filtersRepository;
	
	//Listando todos os pagamentos
	@GetMapping("/pagamentos")
	public List<Pagamento> show(){
		return pagamentorepository.findAll();
	}
	
	// filtrando por mais de um
	@GetMapping("/pagamentos/filters")
	public List<Pagamento> findPayment(
			@RequestParam(value = "id", required = false) Long id,
			@RequestParam(value = "doc_payer", required = false) Long doc_payer,
			@RequestParam(value = "status", required = false) String status
			){
				return filtersRepository.find(id, doc_payer, status)
						.stream()
						.map(Pagamento::converter)
						.collect(Collectors.toList());
			}
	
	//Cadastrar os pagamentos
	@PostMapping("/pagamentos")
	public Pagamento add(@RequestBody /*@Valid*/ Pagamento pagamento) {
		return pagamentorepository.save(pagamento);
	}
	
	/*//Apagando um pagamento
	@DeleteMapping("/pagamentos/{id}")
	public String deletePagamento(@PathVariable String id) {

		System.out.println(deleteRepository.deletePaymenteFromStatus(id));
		return "Oi";
	}*/
	
	

}
