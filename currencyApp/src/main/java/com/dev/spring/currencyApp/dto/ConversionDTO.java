package com.dev.spring.currencyApp.dto;

import java.math.BigDecimal;

public class ConversionDTO {

	private String from;
	private String to;
	private BigDecimal quantity;
	private BigDecimal convertedValue;
	public ConversionDTO(String from, String to, BigDecimal quantity, BigDecimal convertedValue) {
	
		this.from = from;
		this.to = to;
		this.quantity = quantity;
		this.convertedValue = convertedValue;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getQuantity() {
		return quantity;
	}
	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	public BigDecimal getConvertedValue() {
		return convertedValue;
	}
	public void setConvertedValue(BigDecimal convertedValue) {
		this.convertedValue = convertedValue;
	}
	@Override
	public String toString() {
		return "ConversionDTO [from=" + from + ", to=" + to + ", quantity=" + quantity + ", convertedValue="
				+ convertedValue + "]";
	}
	
	
	
}
