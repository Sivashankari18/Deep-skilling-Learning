package SingleTon;

import java.util.*;

public class Main {
	 public static void main(String[] args) {
		        BookingSystem booking = new BookingSystem();
		        Scanner scanner = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("\n1. Book Ticket");
		            System.out.println("2. Show Available Seats");
		            System.out.println("3. Exit");
		            System.out.print("Enter your choice: ");
		            choice = scanner.nextInt();
		            scanner.nextLine();  // consume newline

		            switch (choice) {
		                case 1:
		                    booking.bookTicket();
		                    break;
		                case 2:
		                    booking.showAvailableseats();
		                    break;
		                case 3:
		                    Logger.getInstance().log("Application exited.");
		                    System.out.println("Thank you for using the Transport App.");
		                    break;
		                default:
		                    Logger.getInstance().log("Invalid choice entered: " + choice);
		                    System.out.println("Invalid choice! Try again.");
		            }

		        } 
		        
		    while (choice != 3);
    }

}


