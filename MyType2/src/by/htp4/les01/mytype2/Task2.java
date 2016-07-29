package by.htp4.les01.mytype2;

import static java.lang.Math.sin;
import static java.lang.Math.pow;
import static java.lang.Math.abs;

public class Task2 {

	public static void main(String[] args) {

		double x;
		double y;
		double result;

		x = InputParserDouble.inp_par_dou("Enter x. ");

		y = InputParserDouble.inp_par_dou("Enter y. ");

		result = func(x, y);

		System.out.print("Your result is " + result);

	}

	private static double func(double x, double y){
		
		double result;
		
		result = (1.0 + pow(sin(x + y), 2)) / (2.0 + abs(x - 2.0 * x / (1.0 + x * x * y * y))) + x;
		
		return result;
		
	}
	
}
