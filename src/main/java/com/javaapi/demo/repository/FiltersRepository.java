package com.javaapi.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.javaapi.demo.model.Pagamento;
import com.javaapi.demo.model.StatusPayment;

import jakarta.persistence.EntityManager;

@Repository
public class FiltersRepository {

	private final EntityManager em;

	public FiltersRepository(EntityManager em) {
		this.em = em;
	}

	public List<Pagamento> find( Integer cod_debit, Long doc_payer, StatusPayment status) {

		String query = "select p from Pagamento as p";
		String condition = " where ";
		// String ret = "Não encontrado";

		// System.out.println("AQUI: "+id + "DOC_PAYER: "+ doc_payer);
		if (cod_debit != null) {
			query += condition + " p.cod_debit = :cod_debit ";
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

		if (cod_debit != null) {
			q.setParameter("cod_debit", cod_debit);
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
