package week1.day1;

public class Day1fact {

	public static void main(String[] arg) {
		int i;
		int fact=1;
		int number=5; // calculate the factorial values 
		for(i=1;i<=number;i++) {
			fact=fact*i;
			System.out.println(fact);
		}
}
}
