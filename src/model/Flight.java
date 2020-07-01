package model;

import java.time.LocalDate;

//Type your code 
public class Flight {
	private int noOfPersons;
	private String classType;
	private int rates;
	private LocalDate from;
	private LocalDate to;
	private String triptype;
	
	public int getNoOfPersons() {
		return this.noOfPersons;
	}
	
	public String getClassType() {
		return this.classType;
	}
	
	public int getRates() {
		return this.rates;
	}
	
	public LocalDate getFrom() {
		return this.from;
	}
	
	public LocalDate getTo() {
		return this.to;
	}
	
	public String getTripType() {
		return this.triptype;
	}
	
	public void setNoOfPersons() {
		this.noOfPersons=noOfPersons;
	}
	
	public void setClassType() {
		this.classType=classType;
	}
	
	public void setRates() {
		this.rates=rates;
	}
	
	public void setFrom() {
		this.from=from;
	}
	
	public void setTo() {
		this.to=to;
	}
	
	public void setTripType() {
		this.triptype=triptype;
	}
	
	public Flight(int noOfPersons, int rates, LocalDate from,LocalDate to,String triptype) {
		this.noOfPersons=noOfPersons;
		this.classType=classType;
		this.from=from;
		this.to=to;
		this.triptype=triptype;
	}
	
	
	
	
	
	
	
	
}