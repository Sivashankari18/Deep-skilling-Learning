package Finance;

	import java.util.Scanner;

	public class FinancialForecast {

	   
	    public static double forecast(double principal, double rate, int years) {
	        if (years == 0) {
	            return principal;
	        }
	        return forecast(principal, rate, years - 1) * (1 + rate);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Enter initial investment amount Rs: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter annual growth rate (in %): ");
	        double rate = scanner.nextDouble() / 100.0; 

	        System.out.print("Enter number of years: ");
	        int years = scanner.nextInt();

	      
	        double result = forecast(principal, rate, years);

	        
	        System.out.printf("Projected value after %d years: ₹%.2f\n", years, result);

	        scanner.close();
	    }
	}



