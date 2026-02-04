package Taxi;

public class Booking {

	
	int BookingId,customerID,pickUpTime,dropTime;
	char  from,to;
	double amount;
	
	
	
	public Booking(int bookingId, int customerID, int pickUpTime, int dropTime, char from, char to, double amount) {
		
		BookingId = bookingId;
		this.customerID = customerID;
		this.pickUpTime = pickUpTime;
		this.dropTime = dropTime;
		this.from = from;
		this.to = to;
		this.amount = amount;
	}
}
