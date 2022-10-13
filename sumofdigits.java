package week1.day2;

public class sumofdigits {
	public static void main(String[] args) {
		
		int num=12345;
		int add=0;
		while(num>0) {
			int rem= num%10;
			add=add+rem;
			num=num/10;
			
			
		}
		System.out.println("sum fo the Digits" + add);
	}
	

}
