package Taxi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Taxiibookingsystem {
	
	static Scanner sc=new Scanner(System.in);
	static List<Taxi> taxi = new ArrayList<>();
	static int count=101;
	public static void main(String[] args) {
		
		System.out.println("-----Welcome To Taxi Booking Service-----");
		System.out.println("Enter The number of Taxi : ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			taxi.add(new Taxi(i));
		}
		
		while(true)
		{
			System.out.println("1.Book Taxi \n2.Display taxi Details \n3. Exit");
		    System.out.println("Enter your choice : ");
		    int choice=sc.nextInt();
		    
		    switch(choice)
		    {
		         case 1: 
		        	    TaxiBooking();
		            break;
		         case 2:
		        	     TaxiDetails();
		        	     break;
		         case 3:
		        	      System.out.println("Exiting...");
		        	      return;
		        	 default:
		        	    	  System.out.println("Invalid Choice");
		    }
		    
		}
	}

	private static void TaxiBooking() {
		int customerId=count++;
		System.out.print("Enter Your PickUp point :");
		char pickuppoint=sc.next().toUpperCase().charAt(0);
		System.out.println("Enter the Drop Point  :");
		char Droppoint=sc.next().toUpperCase().charAt(0);
		System.out.println("Enter the PickUpTiming :");
		int pickuptime=sc.nextInt();
		
		Taxi selectedtaxi=null;
		int minDistance=Integer.MAX_VALUE;
		
		for(Taxi tax: taxi)
		{
			if(tax.TaxiisAvailable(pickuptime))
			{
				int distance= Math.abs(tax.currentPoint - pickuppoint);
				if(selectedtaxi == null ||distance < minDistance || distance ==minDistance && tax.totalEarning < selectedtaxi.totalEarning)
				{
					selectedtaxi =tax;
					minDistance=distance;
				}
			}
		}
		if(selectedtaxi == null )
		{
			System.out.println("taxi NOt Available");
			return;
		}
		
		int dropTime= pickuptime + Math.abs(Droppoint-pickuppoint);	
		double amount =selectedtaxi.calculation(pickuppoint, Droppoint);
		int bookingId =selectedtaxi.booking.size()+1;
		
		
		Booking booking =new Booking(bookingId,customerId,pickuptime,dropTime,pickuppoint,Droppoint,amount);
		selectedtaxi.addBooking(booking);
		System.out.println("Taxi "+ selectedtaxi.id+" is allocated");
	}

	private static void TaxiDetails() {
		
				for(Taxi taxis:taxi)
				{
					System.out.println("Taxi"+taxis.id + " Total Earning :" +taxis.totalEarning);
					
					for (Booking book : taxis.booking) {
			            System.out.println(
			                    "BookingID: " + book.BookingId +
			                    " CustomerID: " + book.customerID +
			                    " From: " + book.from +
			                    " To: " + book.to +
			                    " PickupTime: " + book.pickUpTime +
			                    " DropTime: " + book.dropTime +
			                    " Amount: " + book.amount
			            );
			        }
				}
			   
				 
		
		
	}

}
