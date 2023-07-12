package Activity_4;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double principle, interestRate, numOfYears5, numOfYears8, profit, profit2;
		
		principle = 1000; 
		interestRate = 0.0625;
		numOfYears5 = 5;
		numOfYears8 = 8;
		profit = principle * Math.pow(1 + interestRate, numOfYears5) - principle;
		profit2 = principle * Math.pow(1 + interestRate, numOfYears8) - principle;

        System.out.printf("The profit of investment with a principle of $1000.00, "
        		+ "interest rate of 6.25%% over the \ncourse of %.0f years is: $%.2f", numOfYears5, profit);
        
        System.out.printf("\n\nThe profit of investment with a principle of $1000.00, "
        		+ "interest rate of 6.25%% over the \ncourse of %.0f years is: $%.2f", numOfYears8, profit2);
		


	}

}
