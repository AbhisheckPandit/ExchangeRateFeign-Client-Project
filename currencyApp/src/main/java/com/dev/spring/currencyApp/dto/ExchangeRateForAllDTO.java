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
public class ExchangeRateForAllDTO {


    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("base")
    private String base;
    @JsonProperty("date")
    private String date;
    
    @JsonProperty("rates")
    private RateForALLCurrency ratesForAllCurrency;


    /**
     * No args constructor for use in serialization
     * 
     */
    public ExchangeRateForAllDTO() {
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
    public ExchangeRateForAllDTO(Boolean success, Integer timestamp, String base, String date, RateForALLCurrency rateForALLCurrency) {
    	
    	this.success = success;
    	this.timestamp = timestamp;
    	this.base = base;
    	this.date = date;
    	this.ratesForAllCurrency = rateForALLCurrency;
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
    public RateForALLCurrency getRates() {
    	//System.out.println(ratesForAllCurrency);
    return ratesForAllCurrency;
    }

    @JsonProperty("rates")
    public void setRates(RateForALLCurrency rateForALLCurrency) {
    this.ratesForAllCurrency = rateForALLCurrency;
   // System.out.println(this.ratesForAllCurrency);
    }


	@Override
	public String toString() {
		return "ExchangeRateDTO [success=" + success + ", timestamp=" + timestamp + ", base=" + base + ", date=" + date
				+ ", rateForAllCurrency=" + ratesForAllCurrency + "]";
	}

}

