package model;

import java.time.LocalDate;

// Type your code
public class Hotel {
	private int noOfPersons;
	private String roomType;
	private int rates;
	private String occupancy;
	private LocalDate fromdate;
	private LocalDate todate;
	
	public int getNoOfPersons() {
		return this.noOfPersons;
	}
	
	
	public String getRoomType() {
		return this.roomType;
	}
	
	public int getRates() {
		return this.rates;
	}
	
	public String getOccupancy() {
		return this.occupancy;
	}
	
	public LocalDate getFromDate() {
		return this.fromdate;
	}
	
	
	public LocalDate getToDate() {
		return this.todate;
	}
	
	public void setNoOfPersons() {
		this.noOfPersons=noOfPersons;
	}
	
	public void setRoomType() {
		this.roomType=roomType;
	}
	
	public void setRates() {
		this.rates=rates;
	}
	
	public void setOccupancy() {
		this.occupancy=occupancy;
	}
	
	public void setFromDate() {
		this.fromdate=fromdate;
	}
	
	public void setToDate() {
		this.todate=todate;
	}
	
	Hotel(int noOfPersons, String roomType, int rates,String occupancy,LocalDate fromdate,LocalDate todate){
		this.noOfPersons=noOfPersons;
		this.roomType=roomType;
		this.rates=rates;
		this.occupancy=occupancy;
		this.fromdate=fromdate;
		
	}

}