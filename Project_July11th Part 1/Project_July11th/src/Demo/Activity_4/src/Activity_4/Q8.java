package Activity_4;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a value in Fahrenheit");
		double f = kb.nextDouble();
		
		double c = (f - 32) * 5 / 9;
		
		System.out.println(c + "°C");
		
		kb.close();
		
	}

}