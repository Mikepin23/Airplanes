package Activity_4;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please give me a number");
		int num = kb.nextInt();
		
		int fact = 1;
		
		 for (int i = 1 ; i <= num ; i++) {
			 fact = fact * i;
		 }
		 System.out.println("The factorial of " + num + " is : " + fact);
		 
		 kb.close();

	}

}
