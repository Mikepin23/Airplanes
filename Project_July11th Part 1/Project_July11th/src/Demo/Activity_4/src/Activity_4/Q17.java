package Activity_4;

import java.util.Scanner;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a valid integer");
		int num = kb.nextInt();
		
		int i, mult;
		
		for (i = 1; i <= 10; i++) {
			mult = num * i;
			System.out.println(num + " X " + i + " = " + mult);
		}
		
		kb.close();

	}

}
