package com.javaapi.demo.model;

public enum StatusPayment {

	SUCCESS(1), PENDING(2), FAIL(3);

	public final int valueStatus;

	StatusPayment(int valueStatus) {
		// TODO Auto-generated constructor stub
		this.valueStatus = valueStatus;
	}

}
