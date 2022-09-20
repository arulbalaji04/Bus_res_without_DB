package busRes;
import java.util.ArrayList;
import java.util.Scanner;

public class busDemo {

	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>(); //arraylist for bus collection
		ArrayList<Booking> bookings = new ArrayList<Booking>(); // arraylist for booking collection
		
		buses.add(new Bus(1,true,2));
		buses.add(new Bus(2,false,3));
		buses.add(new Bus(3,true,4));
		
		int userOpt = 1;
		Scanner sc = new Scanner(System.in);
		
		//foreach loop = for every Bus object(b) :present in the list(buses)
		for(Bus b:buses) {
			b.DisplayBusInfo();
		}
		
		while(userOpt==1) {
			System.out.println("Enter 1 to book, and 2 to exit");
			userOpt=sc.nextInt();
			if(userOpt==1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Your booking is conformed...");
				}
				else 
					System.out.println("Sorry, Bus is full try another bus or date.. ");
			}
			
		}

	}

}
   