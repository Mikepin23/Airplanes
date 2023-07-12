package Activity_4;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input the number of terms: ");
		int numOfTerms = kb.nextInt();
		int sequence = 0;
		int sequenceSum = 0;
		
		for (int i = 0; i <= numOfTerms - 1; i++) {
			sequence = sequence * 10 + 1;
			sequenceSum += sequence;
			  if (i != numOfTerms) {
	                System.out.print(sequence + " + ");
	            } else {
	            	System.out.print(sequence + " ");
	            }
		}
		
		System.out.println("\nThe Sum is: " + sequenceSum);
		
		kb.close();

	}

}
