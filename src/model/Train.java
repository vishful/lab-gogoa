package model;

import java.time.LocalDate;

// Type your code
public class Train {
	private int noOfPersons;
	private String berth;
	private int rates;
	private LocalDate date;
	
	
	public int getNoOfPersons() {
		return this.noOfPersons;
	}
	
	public String getBerth() {
		return this.berth;
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
	
	public void setBerth() {
		this.berth=berth;
	}
	
	public void setRates() {
		this.rates=rates;
	}
	
	public void setDate() {
		this.date=date;
	}
	
	Train(int noOfPersons, int rates, String berth, LocalDate date) {
		this.noOfPersons=noOfPersons;
		this.berth=berth;
		this.rates=rates;
		this.date=date;
	}	
}