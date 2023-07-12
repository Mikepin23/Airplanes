package Activity_4;

import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner kb = new Scanner(System.in);
		
		int minutes, minutesPerDay, minutesPerYear, years, remainingMinutes, days;

		minutes = kb.nextInt();

        minutesPerDay = 24 * 60; 
        minutesPerYear = minutesPerDay * 365; 

        years = minutes / minutesPerYear;
        remainingMinutes = minutes % minutesPerYear;
        days = remainingMinutes / minutesPerDay;

        // Print the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
		
		kb.close();
		
	}

}
