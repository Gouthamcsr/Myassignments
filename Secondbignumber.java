package week1.day2;

import java.util.Arrays;

public class Secondbignumber {
	
	public static void main(String[] args) {
		int[] numbers= {5,10,15,20,25,30};
		int length=numbers.length;
		Arrays.sort(numbers);
		System.out.println(numbers[length-2]);
		
		
		
	}

}
