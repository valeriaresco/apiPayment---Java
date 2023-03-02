package com.javaapi.demo.model;


import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
//import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name = "Pagamento")
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	 private Integer cod_debit;
	 
	@NotNull
	private Long doc_payer;
	
	@NotNull
	private String payment_method;
	
	@NotNull
	private Float payment_amount;
	
	@NotNull
		private String status;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCod_debit() {
		return cod_debit;
	}

	public void setCod_debit(Integer cod_debit) {
		this.cod_debit = cod_debit;
	}

	public Long getDoc_payer() {
		return doc_payer;
	}

	public void setDoc_payer(Long doc_payer) {
		this.doc_payer = doc_payer;
	}

	public String getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}

	public Float getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(Float payment_amount) {
		this.payment_amount = payment_amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public static Pagamento converter(Pagamento p) {
		var pagamento = new Pagamento();
		
		pagamento.setId(p.getId());
		pagamento.setCod_debit(p.getCod_debit());
		pagamento.setPayment_method(p.getPayment_method());
		pagamento.setPayment_amount(p.getPayment_amount());
		pagamento.setDoc_payer(p.getDoc_payer());
		pagamento.setStatus(p.getStatus());
		
		return pagamento;
	}
	
	
}
