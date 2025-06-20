package ECommerce;

	import java.util.Scanner;

	public class SearchTest {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        Product[] products = {
	            new Product(101, "Laptop", "Electronics"),
	            new Product(102, "Shirt", "Clothing"),
	            new Product(103, "Mobile", "Electronics"),
	            new Product(104, "Shoes", "Footwear"),
	            new Product(105, "Watch", "Accessories")
	        };

	        System.out.println("Choose search method:");
	        System.out.println("1. Linear Search");
	        System.out.println("2. Binary Search");
	        System.out.print("Enter choice (1 or 2): ");
	        int choice = scanner.nextInt();
	        scanner.nextLine();  // clear the buffer

	        System.out.print("Enter product name to search: ");
	        String name = scanner.nextLine();

	        Product result = null;
	        if (choice == 1) {
	            result = LinearSearch.search(products, name);
	        } else if (choice == 2) {
	            result = BinarySearch.search(products, name);
	        } else {
	            System.out.println("Invalid choice.");
	            return;
	        }

	        if (result != null) {
	            System.out.println("Product found: " + result);
	        } else {
	            System.out.println("Product not found.");
	        }

	        scanner.close();
	    }
	}



