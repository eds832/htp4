package by.htp4.les01.mytype2;

public class Task1 {

	public static void main(String[] args) {

		double inp;
		double result;
		
		inp = InputParserDouble.inp_par_dou("");

		result = formula(inp);

		System.out.print("Your result is " + result);
	}

	private static double formula(double inp) {

		double result;

		result = inp - (inp * inp * inp / 3.0) + (inp * inp * inp * inp * inp / 5.0);

		return result;
	}
	
}
