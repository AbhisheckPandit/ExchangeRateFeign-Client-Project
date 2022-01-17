package com.dev.spring.currencyApp.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dev.spring.currencyApp.dto.ConversionDTO;
import com.dev.spring.currencyApp.dto.CurrencyRateDTO;
import com.dev.spring.currencyApp.dto.ExchangeRateDTO;
import com.dev.spring.currencyApp.dto.ExchangeRateForAllDTO;
import com.dev.spring.currencyApp.dto.RateForALLCurrency;
import com.dev.spring.currencyApp.dto.Rates;
import com.dev.spring.currencyApp.proxy.ExchangeClientProxy;
import com.dev.spring.currencyApp.service.ConversionFromTo;

@RestController
public class CurrencyController {

	@Autowired
	private ExchangeClientProxy proxy;

	@GetMapping("/currency-rate")
	public ExchangeRateDTO getListOfExchangeRate() {
		// @PathVariable("from") String from,@PathVariable("to") String to
		// ExchangeRateDTO response=proxy.getListOfExchangeRate();
		ExchangeRateDTO exchangeRateDTO = null;
		// ResponseEntity<T>= proxy.getListOfExchangeRate();

		Object json;
		// System.out.println(response);
		// List<Object> response=proxy.getListOfExchangeRate();
		Rates rateObj = proxy.getListOfExchangeRate().getRates();
		System.out.println(rateObj);
		System.out.println(proxy.getListOfExchangeRate().toString());
		exchangeRateDTO = proxy.getListOfExchangeRate();
		System.out.println(exchangeRateDTO);
		return proxy.getListOfExchangeRate();
	}

	@GetMapping("/currency-rate/currencycode/{currencyCode}")
	public CurrencyRateDTO getListOfAllExchangeRate(@PathVariable("currencyCode") String currencyCode) {

		RateForALLCurrency ratesAll = null;
		Map<String,Double> currencyRate=new HashMap();
		RateForALLCurrency rateForAll = proxy.getConversionValue().getRates();
		ConversionFromTo convertObj=new ConversionFromTo();
		CurrencyRateDTO exchangeRate=convertObj.getexchangeRate(currencyRate,rateForAll,currencyCode);
		
		//System.out.println(ratesAll);
		// System.out.println(proxy.getConversionValue().getRates().getAed());
		return exchangeRate;
	}

	
	@GetMapping("/convert/from/{from}/to/{to}/amount/{amount}")
	public ConversionDTO getConversionAmount(@PathVariable("from") String from,
			@PathVariable("to") String to,@PathVariable("amount") BigDecimal amount) {

		RateForALLCurrency ratesAll = null;
		Map<String,Double> currencyRate=new HashMap();

		RateForALLCurrency rateForAll = proxy.getConversionValue().getRates();
		//System.out.println(rateForAll.getAed());

		
		ConversionFromTo convertObj=new ConversionFromTo();
		ConversionDTO convertedResponse=convertObj.getconversionValue(currencyRate,rateForAll,from,to,amount);
		
		//System.out.println(ratesAll);
		// System.out.println(proxy.getConversionValue().getRates().getAed());
		return convertedResponse;
	}

	
}