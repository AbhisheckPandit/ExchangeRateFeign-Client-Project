package com.dev.spring.currencyApp.service;

import java.math.BigDecimal;
import java.util.Map;

import com.dev.spring.currencyApp.dto.ConversionDTO;
import com.dev.spring.currencyApp.dto.CurrencyRateDTO;
import com.dev.spring.currencyApp.dto.RateForALLCurrency;




public class ConversionFromTo {

	
	
	public ConversionDTO getconversionValue(Map<String, Double> currencyRate, RateForALLCurrency rateForAll, String from, String to, BigDecimal amount) {
		Map<String,Double> currencyExchangeRate=getMapValueForCode(currencyRate,rateForAll);
		
		System.out.println(currencyExchangeRate.get(from));
		System.out.println(currencyExchangeRate.get(to));
		double result1=currencyExchangeRate.get(from)/currencyExchangeRate.get(to);
		BigDecimal result=amount.multiply(BigDecimal.valueOf(result1));
		
		//BigDecimal result=BigDecimal.valueOf(currencyRate.get(from)/currencyRate.get(to));)
		
		return new ConversionDTO(from, to, amount, result);
	}

	private Map<String, Double> getMapValueForCode(Map<String, Double> currencyRate, RateForALLCurrency rateForAll) {
		currencyRate.put("AFN", rateForAll.getAfn());
		currencyRate.put("ALL", rateForAll.getAll());
		currencyRate.put("AMD", rateForAll.getAmd());
		currencyRate.put("ANG", rateForAll.getAng());
		currencyRate.put("AOA", rateForAll.getAoa());
		currencyRate.put("ARS", rateForAll.getArs());
		currencyRate.put("AUD", rateForAll.getAud());
		currencyRate.put("AWG", rateForAll.getAwg());
		currencyRate.put("AZN", rateForAll.getAzn());
		currencyRate.put("BAM", rateForAll.getBam());
		currencyRate.put("BBD", rateForAll.getBbd());
		currencyRate.put("BDT", rateForAll.getBdt());
		currencyRate.put("BGN", rateForAll.getBgn());
		currencyRate.put("BHD", rateForAll.getBhd());
		currencyRate.put("BIF", rateForAll.getBif());
		currencyRate.put("BMD", rateForAll.getBmd());
		currencyRate.put("BND", rateForAll.getBnd());
		currencyRate.put("BOB", rateForAll.getBob());
		currencyRate.put("BRL", rateForAll.getBrl());
		currencyRate.put("BSD", rateForAll.getBsd());
		currencyRate.put("BTC", rateForAll.getBtc());
		currencyRate.put("BTN", rateForAll.getBtn());
		currencyRate.put("BWP", rateForAll.getBwp());
		currencyRate.put("BYN", rateForAll.getByn());
		currencyRate.put("BYR", rateForAll.getByr());
		currencyRate.put("BZD", rateForAll.getBzd());
		currencyRate.put("CAD", rateForAll.getCad());
		currencyRate.put("CDF", rateForAll.getCdf());
		currencyRate.put("CHF", rateForAll.getChf());
		currencyRate.put("CLF", rateForAll.getClf());
		currencyRate.put("CLP", rateForAll.getClp());
		currencyRate.put("CNY", rateForAll.getCny());
		currencyRate.put("COP", rateForAll.getCop());
		currencyRate.put("CRC", rateForAll.getCrc());
		currencyRate.put("CUC", rateForAll.getCuc());
		currencyRate.put("CUP", rateForAll.getCup());
		currencyRate.put("CVE", rateForAll.getCve());
		currencyRate.put("CZK", rateForAll.getCzk());
		currencyRate.put("DJF", rateForAll.getDjf());
		currencyRate.put("DKK", rateForAll.getDkk());
		currencyRate.put("DOP", rateForAll.getDop());
		currencyRate.put("DZD", rateForAll.getDzd());
		currencyRate.put("EGP", rateForAll.getEgp());
		currencyRate.put("ERN", rateForAll.getErn());
		currencyRate.put("ETB", rateForAll.getEtb());
		currencyRate.put("EUR",(double) rateForAll.getEur());
		currencyRate.put("FJD", rateForAll.getFjd());
		currencyRate.put("FKP", rateForAll.getFkp());
		currencyRate.put("GBP", rateForAll.getGbp());
		currencyRate.put("GEL", rateForAll.getGel());
		currencyRate.put("GGP", rateForAll.getGgp());
		currencyRate.put("GHS", rateForAll.getGhs());
		currencyRate.put("GIP", rateForAll.getGip());
		currencyRate.put("GMD", rateForAll.getGmd());
		currencyRate.put("GNF", rateForAll.getGnf());
		currencyRate.put("GTQ", rateForAll.getGtq());
		currencyRate.put("GYD", rateForAll.getGyd());
		currencyRate.put("HKD", rateForAll.getHkd());
		currencyRate.put("HNL", rateForAll.getHnl());
		currencyRate.put("HRK", rateForAll.getHrk());
		currencyRate.put("HTG", rateForAll.getHtg());
		currencyRate.put("HUF", rateForAll.getHuf());
		currencyRate.put("IDR", rateForAll.getIdr());
		currencyRate.put("ILS", rateForAll.getIls());
		currencyRate.put("IMP", rateForAll.getImp());
		currencyRate.put("INR", rateForAll.getInr());
		currencyRate.put("IQD", rateForAll.getIqd());
		currencyRate.put("IRR", rateForAll.getIrr());
	    currencyRate.put("ISK", rateForAll.getIsk());
		currencyRate.put("JEP", rateForAll.getJep());
		currencyRate.put("JMD", rateForAll.getJmd());
		currencyRate.put("JOD", rateForAll.getJod());
		currencyRate.put("JPY", rateForAll.getJpy());
		currencyRate.put("KES", rateForAll.getKes());
		currencyRate.put("KGS", rateForAll.getKgs());
		currencyRate.put("KHR", rateForAll.getKhr());
		currencyRate.put("KMF", rateForAll.getKmf());
		currencyRate.put("KPW", rateForAll.getKpw());
		currencyRate.put("KRW", rateForAll.getKrw());
		currencyRate.put("KWD", rateForAll.getKwd());
		currencyRate.put("KYD", rateForAll.getKyd());
		currencyRate.put("KZT", rateForAll.getKzt());
		currencyRate.put("LAK", rateForAll.getLak());
		currencyRate.put("LBP", rateForAll.getLbp());
		currencyRate.put("LKR", rateForAll.getLkr());
	    currencyRate.put("LRD", rateForAll.getLrd());
		currencyRate.put("LTL", rateForAll.getLtl());
		currencyRate.put("LVL", rateForAll.getLvl());
		currencyRate.put("LYD", rateForAll.getLyd());
		currencyRate.put("MAD", rateForAll.getMad());
		currencyRate.put("MDL", rateForAll.getMdl());
		currencyRate.put("MGA", rateForAll.getMga());
		currencyRate.put("MKD", rateForAll.getMkd());
		currencyRate.put("MMK", rateForAll.getMmk());
		currencyRate.put("MNT", rateForAll.getMnt());
		currencyRate.put("MOP", rateForAll.getMop());
		currencyRate.put("MRO", rateForAll.getMro());
		currencyRate.put("MUR", rateForAll.getMur());
		currencyRate.put("MVR", rateForAll.getMvr());
		currencyRate.put("MWK", rateForAll.getMwk());
		currencyRate.put("MXN", rateForAll.getMxn());
		currencyRate.put("MYR", rateForAll.getMyr());
		currencyRate.put("MZN", rateForAll.getMzn());
		currencyRate.put("NAD", rateForAll.getNad());
		currencyRate.put("NGN", rateForAll.getNgn());
		currencyRate.put("NIO", rateForAll.getNio());
		currencyRate.put("NOK", rateForAll.getNok());
		currencyRate.put("NPR", rateForAll.getNpr());
		currencyRate.put("NZD", rateForAll.getNzd());
		currencyRate.put("OMR", rateForAll.getOmr());
		currencyRate.put("PAB", rateForAll.getPab());
		currencyRate.put("PEN", rateForAll.getPen());
		currencyRate.put("PGK", rateForAll.getPgk());
		currencyRate.put("PHP", rateForAll.getPhp());
		currencyRate.put("PKR", rateForAll.getPkr());
		currencyRate.put("PLN", rateForAll.getPln());
		currencyRate.put("PYG", rateForAll.getPyg());
		currencyRate.put("QAR", rateForAll.getQar());
		currencyRate.put("RON", rateForAll.getRon());
		currencyRate.put("RSD", rateForAll.getRsd());
		currencyRate.put("RUB", rateForAll.getRub());
		currencyRate.put("RWF", rateForAll.getRwf());
		currencyRate.put("SAR", rateForAll.getSar());
		currencyRate.put("SBD", rateForAll.getSbd());
		currencyRate.put("SCR", rateForAll.getScr());
		currencyRate.put("SDG", rateForAll.getSdg());
		currencyRate.put("SEK", rateForAll.getSek());
		currencyRate.put("SGD", rateForAll.getSgd());
		currencyRate.put("SHP", rateForAll.getShp());
		currencyRate.put("SLL", rateForAll.getSll());
		currencyRate.put("SOS", rateForAll.getSos());
		currencyRate.put("SRD", rateForAll.getSrd());
		currencyRate.put("STD", rateForAll.getStd());
		currencyRate.put("SVC", rateForAll.getSvc());
		currencyRate.put("SYP", rateForAll.getSyp());
		currencyRate.put("SZL", rateForAll.getSzl());
		currencyRate.put("THB", rateForAll.getThb());
		currencyRate.put("TJS", rateForAll.getTjs());
		currencyRate.put("TMT", rateForAll.getTmt());
		currencyRate.put("TND", rateForAll.getTnd());
		currencyRate.put("TOP", rateForAll.getTop());
		currencyRate.put("TRY", rateForAll.getTry());
		currencyRate.put("TTD", rateForAll.getTtd());
		currencyRate.put("TWD", rateForAll.getTwd());
		currencyRate.put("TZS", rateForAll.getTzs());
		currencyRate.put("UAH", rateForAll.getUah());
		currencyRate.put("UGX", rateForAll.getUgx());
		currencyRate.put("USD", rateForAll.getUsd());
		currencyRate.put("UYU", rateForAll.getUyu());
		currencyRate.put("UZS", rateForAll.getUzs());
		currencyRate.put("VEF", rateForAll.getVef());
		currencyRate.put("VND", rateForAll.getVnd());
		currencyRate.put("VUV", rateForAll.getVuv());
		currencyRate.put("WST", rateForAll.getWst());
		currencyRate.put("XAF", rateForAll.getXaf());
		currencyRate.put("XAG", rateForAll.getXag());
		currencyRate.put("XAU", rateForAll.getXau());
		currencyRate.put("XCD", rateForAll.getXcd());
		currencyRate.put("XDR", rateForAll.getXdr());
		currencyRate.put("XOF", rateForAll.getXof());
		currencyRate.put("XPF", rateForAll.getXpf());
		currencyRate.put("YER", rateForAll.getYer());
		currencyRate.put("ZAR", rateForAll.getZar());
		currencyRate.put("ZMK", rateForAll.getZmk());
		currencyRate.put("ZMW", rateForAll.getZmw());
		currencyRate.put("ZWL", rateForAll.getZwl());
		
		return currencyRate;
	}

	public CurrencyRateDTO getexchangeRate(Map<String, Double> currencyRate, RateForALLCurrency rateForAll, String currencyCode) {
		Map<String,Double> currencyExchangeRate=getMapValueForCode(currencyRate,rateForAll);
		
		double exchangeRateValue=currencyExchangeRate.get(currencyCode);
		BigDecimal rate=BigDecimal.valueOf(exchangeRateValue);
		
		
		
		return new CurrencyRateDTO(currencyCode,rate);
	}

}
