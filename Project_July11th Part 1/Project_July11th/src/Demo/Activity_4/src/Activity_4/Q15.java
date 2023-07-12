package Activity_4;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter grade: ");
		String grade = kb.next();
		
		if (grade.equals("E") || grade.equals("e")) {
			System.out.println("You have chosen: Excellent");
		} else if (grade.equals("V") || grade.equals("v")) {
			System.out.println("You have chosen: Very Good");
		} else if (grade.equals("G") || grade.equals("g")) {
			System.out.println("You have chosen: Good");
		} else if (grade.equals("A") || grade.equals("a")) {
			System.out.println("You have chosen: Average");
		} else if (grade.equals("F") || grade.equals("f")) {
			System.out.println("You have chosen: Fail");
		} else {
			System.out.println("Enter a valid grade");
		}
		
		kb.close();

	}

}
