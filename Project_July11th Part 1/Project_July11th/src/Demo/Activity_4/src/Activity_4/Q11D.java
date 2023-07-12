package Activity_4;

import java.util.Scanner;

public class Q11D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
        
		System.out.print("Enter the number of lines: ");
        int num = kb.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= num; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        kb.close();

	}

}
