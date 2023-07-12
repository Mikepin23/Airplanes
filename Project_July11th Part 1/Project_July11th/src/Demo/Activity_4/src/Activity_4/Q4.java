package Activity_4;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the first integer value");
		int val1 = kb.nextInt();
		
		System.out.println("Enter the second integer value");
		int val2 = kb.nextInt();
		
		System.out.println("Enter the third integer value");
		int val3 = kb.nextInt();
		
		System.out.println("Enter the fourth integer value");
		int val4 = kb.nextInt();
		
		System.out.println("The greatest value amoung the four is: " + Math.max(Math.max(val1, val2), Math.max(val3, val4)));
		
		kb.close();
		

	}

}
