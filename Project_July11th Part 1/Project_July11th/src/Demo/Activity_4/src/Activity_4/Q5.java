package Activity_4;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a value for a");
		double a = kb.nextDouble();
		
		System.out.println("Enter a value for b");
		double b = kb.nextDouble();
		
		System.out.println("Enter a value for c");
		double c = kb.nextDouble();
		
		double x1, x2;
	
		x1 = ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a)); 
		x2 = ((-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a)); 
		
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		
		kb.close();

	}

}
