package week1.day2;

public class TwoWheelers {

	public static void main(String[] args) {
		
		TwoWheelers obj = new  TwoWheelers();
		int wheels = obj.noOfWheels(2);
		short mirrors = obj.noOfmirriors();
		long chassisno =obj.noOfchassisno(123456789);
		Boolean puncture =obj.countOfPunctured();
		String Bikename =obj.bikeName("BMW");
		double KM =obj.totalKm(500);
		System.out.println("No of Wheels"+wheels);
		System.out.println("No of Mirrors"+mirrors);
		System.out.println("No of chassin"+chassisno);
		System.out.println("countOfPunctured"+puncture);
		System.out.println("bike Name" +Bikename);
		System.out.println("totalKm"+ KM);
		
			
	}
	
	//--------------------------totalKm--------------------------
      private double totalKm(int n3) {
		// TODO Auto-generated method stub
    	  double totalKm = n3;
		return n3;
	}

//---------------------bikename-------------------------------------
	private String bikeName(String name) {
		// TODO Auto-generated method stub
    	  String Bikename = name;
    	  
		return Bikename;
	}


	Boolean countOfPunctured() {
		// TODO Auto-generated method stub
    	  boolean puncture = false;
    	  
		return puncture;
	}
//------------------------chassisno--------------------
public long noOfchassisno(int n2) {
		// TODO Auto-generated method stub
	long chass =  n2;
	
		return chass;
	}
	//-------------------------------------------noOfmirriors-------------------
	public short noOfmirriors() {
		// TODO Auto-generated method stub
		short mirrors =5;
					return mirrors;
	}
//------------------------------------------noOfWheels--------------------------
	public int noOfWheels(int n1) {
		// TODO Auto-generated method stub
		int wheels = n1;
				return wheels;
	}
}
