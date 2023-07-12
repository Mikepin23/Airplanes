package Activity_4;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0, b = 1, c = 0;
	
		for (int i = 1; i <= 300; i++) {
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
			
			if (c > 300) {
				break;
			}
		}

	}

}
