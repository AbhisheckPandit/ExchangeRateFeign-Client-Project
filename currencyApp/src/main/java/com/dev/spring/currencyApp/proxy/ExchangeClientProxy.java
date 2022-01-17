package com.dev.spring.currencyApp.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.spring.currencyApp.dto.ConversionDTO;
import com.dev.spring.currencyApp.dto.CurrencyRateDTO;
import com.dev.spring.currencyApp.dto.ExchangeRateDTO;
import com.dev.spring.currencyApp.dto.ExchangeRateForAllDTO;
import com.dev.spring.currencyApp.dto.RateForALLCurrency;

@FeignClient(name="exchange-service", url="http://api.exchangeratesapi.io/v1")

public interface ExchangeClientProxy {
   // API==http://api.exchangeratesapi.io/v1/latest?access_key=a82974c0ce65bdfda1a7fccfa3debf4a&symbols=USD,AUD,CAD,PLN,MXN&format=1
	@GetMapping("/latest?access_key=a82974c0ce65bdfda1a7fccfa3debf4a&symbols=USD,AUD,CAD,PLN,MXN&format=1")
	public ExchangeRateDTO getListOfExchangeRate();
	
	@GetMapping("/latest?access_key=a82974c0ce65bdfda1a7fccfa3debf4a&format=1")
	public ExchangeRateForAllDTO getConversionValue();
	
	@GetMapping("/latest?access_key=a82974c0ce65bdfda1a7fccfa3debf4a&format=1")
	public ConversionDTO getExchangeValue();
	
	@GetMapping("/latest?access_key=a82974c0ce65bdfda1a7fccfa3debf4a&format=1")
	public CurrencyRateDTO getExchangeRateValue();
	
}
