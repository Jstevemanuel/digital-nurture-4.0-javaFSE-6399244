package Problem_7_Algorithms_DataStructures;

public class FinancialForecast {


	
	    public static double futureValueRecursive(double initialAmount, double growthRate, int years) {
	        if (years == 0) {
	            return initialAmount;  // Base case
	        }
	        return futureValueRecursive(initialAmount * (1 + growthRate), growthRate, years - 1);
	    }


	    public static double futureValueIterative(double initialAmount, double growthRate, int years) {
	        for (int i = 0; i < years; i++) {
	            initialAmount *= (1 + growthRate);
	        }
	        return initialAmount;
	    }

}
