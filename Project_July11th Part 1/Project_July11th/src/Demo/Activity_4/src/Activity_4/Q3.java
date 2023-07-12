package Activity_4;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Enter the grade: ");
		int grade = kb.nextInt();
		
		if (grade > 80) {
			System.out.println('A');
		} else if (grade <= 80 && grade >= 60) {
			System.out.println('B');
		} else if (grade < 60 && grade >= 50) {
			System.out.println('C');
		} else if (grade < 50 && grade >= 45) {
			System.out.println('D');
		} else if (grade < 45 && grade >= 25) {
			System.out.println('E');
		} else if (grade < 25) {
			System.out.println('F');
		}
		
		kb.close();

	}

}
