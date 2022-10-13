package week1.day2;

import java.util.Arrays;

public class printduplicatearrays {
	
	public static void main(String[] args) {
		
		int[] array= { 10,20,30,10,10,15,25,};
		Arrays.sort(array);
		int count = 0;
		System.out.println(" the length of arrays" +array.length);
		for(int i=0; i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				
				if(array[i] ==array[j]) {
					count+=1;
					System.out.println("the duplicate values is :" +array[i]);
				}
				
			}
		}
		
		System.out.println("the duplicate values is :" +count);			
	    	
	    }
		}
	


