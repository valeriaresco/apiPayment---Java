package com.javaapi.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.javaapi.demo.model.Pagamento;

import jakarta.persistence.EntityManager;

@Repository
public class DeleteRepository{
	private final EntityManager em;

	public DeleteRepository(EntityManager em) {
		this.em = em;
	}
	
	public String deletePaymenteFromStatus(String id){
		System.out.println("Aquiiiii: "+id);
		return "A"; 
		/*
		String query = "select d from Pagamento as d where d.cod_debit = :d.cod_debito ";
		
		
		var q = em.createQuery(query, Pagamento.class);
		q.getResultList();
		if (id != null) {
			q.setParameter("cod_debito", id);
		}
		System.out.println("Aquiiiii: "+q.getResultList());
		return(long) 50;*/
	}
	
}
