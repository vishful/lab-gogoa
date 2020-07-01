package services;

import java.time.LocalDate;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code
public class FareCalculator extends Booking{
	
	public double book(Hotel hotel) {
		LocalDate checkIn=hotel.getFromDate();
		LocalDate checkOut=hotel.getToDate();
	while(checkIn.compareTo(checkOut)<0) {
			return booking(hotel.getNoOfPersons(),hotel.getRates());
		}
	return 0;
	}
	public double book(Flight flight) {
		return booking(flight.getNoOfPersons(),flight.getRates());
}

	public double book(Train train) {
		return booking(train.getNoOfPersons(),train.getRates());
}
	
	public double book(Bus bus) {
		return booking(bus.getNoOfPersons(),bus.getRates());
}
	
}