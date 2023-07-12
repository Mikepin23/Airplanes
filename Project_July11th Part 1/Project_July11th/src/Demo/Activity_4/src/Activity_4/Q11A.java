package Activity_4;

import java.util.Scanner;

public class Q11A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
        
		System.out.print("Enter the number of lines: ");
        int num = kb.nextInt();

        for (int i = num; i >= 1; i--) {
            for (int j = i; j <= num; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i = num; i >= 1; i--) {
        	// i = 2
        	// 5432
        	
        	// i = 3
        	// 543
            for (int j = num; j >= i ; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
        
        kb.close();

	}
	
}
