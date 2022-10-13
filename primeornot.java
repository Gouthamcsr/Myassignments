package week1.day2;

public class primeornot {
	public static void main(String[] args) {
		
		int num=6;
		boolean flag=false;
		for (int i=2; i<num;i++) {
			if (num%i==0) {
				flag=true;
				
			}
		}
		if (flag) {
			System.out.println("not prime no");
		}
		else {
			System.out.println("is Prime No");
		}
	}

}
