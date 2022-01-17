package com.dev.spring.currencyApp.dto;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "success",
    "timestamp",
    "base",
    "date",
    "rates"
})
public class ExchangeRateDTO {


    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("base")
    private String base;
    @JsonProperty("date")
    private String date;
    
    @JsonProperty("rates")
    private Rates rates;


    /**
     * No args constructor for use in serialization
     * 
     */
    public ExchangeRateDTO() {
		// TODO Auto-generated constructor stub
	}
    

    /**
     * 
     * @param date
     * @param success
     * @param rates
     * @param timestamp
     * @param base
     */
    public ExchangeRateDTO(Boolean success, Integer timestamp, String base, String date, Rates rates) {
    	
    	this.success = success;
    	this.timestamp = timestamp;
    	this.base = base;
    	this.date = date;
    	this.rates = rates;
    	}
    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("base")
    public String getBase() {
        return base;
    }

    @JsonProperty("base")
    public void setBase(String base) {
        this.base = base;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("rates")
    public Rates getRates() {
    	System.out.println(rates);
    return rates;
    }

    @JsonProperty("rates")
    public void setRates(Rates rates) {
    this.rates = rates;
    System.out.println(this.rates);
    }


	@Override
	public String toString() {
		return "ExchangeRateDTO [success=" + success + ", timestamp=" + timestamp + ", base=" + base + ", date=" + date
				+ ", rates=" + rates + "]";
	}

}

