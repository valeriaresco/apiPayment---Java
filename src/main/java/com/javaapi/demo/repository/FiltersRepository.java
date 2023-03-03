package com.javaapi.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaapi.demo.model.Pagamento;

import jakarta.persistence.EntityManager;

@Repository
public class FiltersRepository {

	private final EntityManager em;

	public FiltersRepository(EntityManager em) {
		this.em = em;
	}

	public List<Pagamento> find(Long id, Long doc_payer, String status) {

		String query = "select p from Pagamento as p";
		String condition = " where ";
		// String ret = "Não encontrado";

		// System.out.println("AQUI: "+id + "DOC_PAYER: "+ doc_payer);
		if (id != null) {
			query += condition + " p.id = :id ";
			condition = " and ";
		}

		if (doc_payer != null) {
			query += condition + " p.doc_payer = :doc_payer ";
			condition = " and ";
		}

		if (status != null) {
			query += condition + " p.status = :status ";
		}

		var q = em.createQuery(query, Pagamento.class);

		if (id != null) {
			q.setParameter("id", id);
		}

		if (doc_payer != null) {
			q.setParameter("doc_payer", doc_payer);
		}

		if (status != null) {
			q.setParameter("status", status);
		}

		return q.getResultList();
	}

}
