package by.htp4.les01.mytype2;

public class InSycle {
	
	public static boolean in_sy(double x, double y, int r){
		
		boolean res = false;
	
		if ((x * x + y * y) <= r * r){
			
			res = true;
			
		}
		
		return res;
	}

}
