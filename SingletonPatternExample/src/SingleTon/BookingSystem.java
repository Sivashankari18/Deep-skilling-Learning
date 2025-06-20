package SingleTon;
import java.util.*;
public class BookingSystem {
	private int Availableseats=10;
	private Logger logger=Logger.getInstance();
	
	public void bookTicket() {
		Scanner s=new Scanner(System.in);
		
		logger.log("Ticket process started.");
		
		if(Availableseats>0) {
			System.out.println("Enter Passenger Name: ");
			String name=s.nextLine();
			Availableseats--;
			logger.log("Ticket booked for: "+name);
			System.out.println("Ticket booked successfully for: "+name+". Remaining Seats: "+Availableseats);
			
		}
		else {
			logger.log("Attempted booking when no seats are available.");
			System.out.println("No seats available.");
		}
			
	}
	
	
	public void showAvailableseats(){
		logger.log("User checked available seats.");
		System.out.println("AvailableSeats: "+Availableseats);
	}
}
