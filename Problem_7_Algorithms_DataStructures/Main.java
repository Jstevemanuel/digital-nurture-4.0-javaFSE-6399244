package Problem_7_Algorithms_DataStructures;

import java.util.Scanner;

public class Main {

      //Recursion is when a method calls itself to solve a smaller part of a problem until it reaches a base case.


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the initial amount: ");
	        double initialAmount = scanner.nextDouble();

	        System.out.print("Enter the annual growth rate (in %): ");
	        double growthRate = scanner.nextDouble();

	        System.out.print("Enter the number of years: ");
	        int years = scanner.nextInt();

	        
	        double resultRecursive = FinancialForecast.futureValueRecursive(initialAmount, growthRate, years);
	        System.out.printf("Future Value (Recursive): %.2f%n", resultRecursive);


	        double resultIterative = FinancialForecast.futureValueIterative(initialAmount, growthRate, years);
	        System.out.printf("Future Value (Iterative): %.2f%n", resultIterative);

	        scanner.close();
	    }
	    
	    //T(n) = T(n-1) + O(1) → O(n)
	    //The recursion runs once for each year → linear time.
	    
	    //The space complexities can be optimized by using iterative approach
              //public static double futureValueIterative(double initial, double rate, int years) {
              //  for (int i = 0; i < years; i++) {
              //	   initial *= (1 + rate);
              //   }
              // return initial;
	}

}




