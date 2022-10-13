package week1.day2;

public class armstrongnumbers {

	public static void main(String[] args) {
		
		int org= 153;
		int remainder;
		int calc=0;
		int n1=org;
		
		while (n1<0) {
			remainder=n1%10;
			calc=calc+remainder+remainder+remainder;
			n1=n1/10;
		}
		if (org==calc) {
			
			System.out.println("yes" +org+" armstrong number");
		} else {
			System.out.println("No not armstrong number" );
		}
	}
}
