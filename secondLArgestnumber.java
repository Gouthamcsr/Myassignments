package week1.day2;

import java.util.Arrays;
public class secondLArgestnumber {
public static void main(String[] args) {
	int array[] = {10,20,30,40,50,60,70};
	int size =array.length;
	Arrays.sort(array);
	int res= array[size-2];
	System.out.println(" second largest number is =" +res);
	
	
	
	
}
}
