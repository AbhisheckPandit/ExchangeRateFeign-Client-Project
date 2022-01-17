package com.dev.spring.currencyApp.dto;

import java.math.BigDecimal;

public class CurrencyRateDTO {

	private String currencyCode;
	private BigDecimal currencyValue;

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public BigDecimal getCurrencyValue() {
		return currencyValue;
	}

	public void setCurrencyValue(BigDecimal currencyValue) {
		this.currencyValue = currencyValue;
	}

	public CurrencyRateDTO(String currencyCode, BigDecimal currencyValue) {
		this.currencyCode = currencyCode;
		this.currencyValue = currencyValue;
	}

	public CurrencyRateDTO() {
		
	}

	@Override
	public String toString() {
		return "CurrencyRate [currencyCode=" + currencyCode + ", currencyValue=" + currencyValue + "]";
	}
	
	

}
