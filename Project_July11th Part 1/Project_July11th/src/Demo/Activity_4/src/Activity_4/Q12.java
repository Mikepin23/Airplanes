package Activity_4;

import java.util.Scanner;

public class Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int number = kb.nextInt();
		
		for (int i = 1; i <= number; i++) {
			int cube = (int) Math.pow(i, 3);
			System.out.println("Number is " + i + " and the cube of " + i + " is :" + cube);
		}
		
		
		kb.close();

	}

}
