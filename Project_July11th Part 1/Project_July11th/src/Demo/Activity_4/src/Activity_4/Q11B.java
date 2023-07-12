package Activity_4;

import java.util.Scanner;

public class Q11B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
        
		System.out.print("Enter the number of lines: ");
        int num = kb.nextInt();

        for (int i = num; i >= 1; i--) {
        	for (int j = 1; j <= num; j++)
                System.out.print(j);
        	}
        	 System.out.println();
          
           
      

        kb.close();

		
	
		
		
		
	}
}
		


