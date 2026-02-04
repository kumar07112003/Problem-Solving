package Taxi;

import java.util.ArrayList;
import java.util.List;

class Taxi {

	int id;
	char currentPoint='A';
	double totalEarning=0;
	
	List<Booking> booking=new ArrayList<>();
	
	public Taxi(int id) {
		this.id=id;
	}
	
	//check booking is empty or not and if it is empty return true else it willl check that the req time by the clinent is avalible or not
	public  Boolean TaxiisAvailable(int reqtime)
	{
		if(booking.isEmpty())
		return true;
		Booking Lastbooking=booking.get(booking.size()-1);
		return Lastbooking.dropTime <= reqtime;
	}
	
	public int calculation(char from,char to)
	{
		int distance= Math.abs(to-from)*15; // A - C 67-65=2*15=30km
		return 100+Math.max(0, (distance-5)*10); // first 5km =100 +(0,30-5)*10)=100+25*10=100+250=350rs
	}
	
	public  void addBooking(Booking bookings)
	{
		booking.add(bookings);
		totalEarning += bookings.amount;
		currentPoint = bookings.to;
	}

	
	
	

}
