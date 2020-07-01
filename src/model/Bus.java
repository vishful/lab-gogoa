package model;

import java.time.LocalDate;

// Type your code
public class Bus {
	private int noOfPersons;
	private String busType;
	private int rates;
	private LocalDate date;
	
	public int getNoOfPersons() {
		return this.noOfPersons;
	}
	
	public String getBusType() {
		return this.busType;
	}
	
	public int getRates() {
		return this.rates;
	}
	
	public LocalDate getDate() {
		return this.date;
	}
	
	public void setNoOfPersons() {
		this.noOfPersons=noOfPersons;
	}
	
	public void setBusType() {
		this.busType=busType;
	}
	
	public void setRates() {
		this.rates=rates;
	}
	
	public void setDate() {
		this.date=date;
	}
	
	Bus(int noOfPersons, int rates, String busType, LocalDate date) {
		this.noOfPersons=noOfPersons;
		this.busType=busType;
		this.rates=rates;
		this.date=date;
	}
	
}