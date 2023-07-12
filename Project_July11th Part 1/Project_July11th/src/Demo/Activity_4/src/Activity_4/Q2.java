package Activity_4;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle");
		double length = kb.nextDouble();
		
		System.out.println("Enter the width of the rectangle");
		double width = kb.nextDouble();
		
		if ( length == width) {
			System.out.println("The rectangle is square");
		} else {
			System.out.println("The rectangle is not square");
		}
		
		kb.close();
				

	}

}
