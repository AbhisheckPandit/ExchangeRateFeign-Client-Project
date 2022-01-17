package com.dev.spring.currencyApp.dto;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"USD",
"AUD",
"CAD",
"PLN",
"MXN"
})
@Generated("jsonschema2pojo")
public class Rates {

@JsonProperty("USD")
private Double usd;
@JsonProperty("AUD")
private Double aud;
@JsonProperty("CAD")
private Double cad;
@JsonProperty("PLN")
private Double pln;
@JsonProperty("MXN")
private Double mxn;

/**
* No args constructor for use in serialization
*
*/
public Rates() {
}

/**
*
* @param aud
* @param mxn
* @param pln
* @param usd
* @param cad
*/
public Rates(Double usd, Double aud, Double cad, Double pln, Double mxn) {

this.usd = usd;
this.aud = aud;
this.cad = cad;
this.pln = pln;
this.mxn = mxn;
}

public Rates(Double mxn) {
	this.mxn = mxn;
}

@JsonProperty("USD")
public Double getUsd() {
return usd;
}

@JsonProperty("USD")
public void setUsd(Double usd) {
this.usd = usd;
}

@JsonProperty("AUD")
public Double getAud() {
return aud;
}

@JsonProperty("AUD")
public void setAud(Double aud) {
this.aud = aud;
}

@JsonProperty("CAD")
public Double getCad() {
return cad;
}

@JsonProperty("CAD")
public void setCad(Double cad) {
this.cad = cad;
}

@JsonProperty("PLN")
public Double getPln() {
return pln;
}

@JsonProperty("PLN")
public void setPln(Double pln) {
this.pln = pln;
}

@JsonProperty("MXN")
public Double getMxn() {
return mxn;
}

@JsonProperty("MXN")
public void setMxn(Double mxn) {
this.mxn = mxn;
}

@Override
public String toString() {
	return "Rates [usd=" + usd + ", aud=" + aud + ", cad=" + cad + ", pln=" + pln + ", mxn=" + mxn + "]";
}

}