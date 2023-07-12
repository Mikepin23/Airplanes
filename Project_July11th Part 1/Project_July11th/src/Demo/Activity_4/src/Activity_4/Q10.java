package Activity_4;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		double first = kb.nextDouble();
		
		System.out.println("Enter the second number");
		double second = kb.nextDouble();
		
		System.out.println("Enter the third number");
		double third = kb.nextDouble();
		
		double average = (first + second + third) / 3;
		
		System.out.println("The average is: " + average);
		
		kb.close();

	}

}
