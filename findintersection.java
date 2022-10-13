package week1.day2;

public class findintersection {
	public static void main(String[] args) {
		int[] arr1= {5,10,20,30,40,50};
		
		int[] arr2= {50,55,5,20,70,65};
		 
		
		for(int i=0; i<arr1.length;i++) {
			
			for(int j=0;j<arr2.length;j++) {
				
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					
				}
				
			}
		}
		
	}

}
