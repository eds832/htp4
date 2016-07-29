package by.htp4.les01.mytype2;

public class Task9 {

	public static void main(String[] args) {

		double x;
		double y;
		double m;
		double n;

		x = InputParserDouble.inp_par_dou("Enter x. ");

		y = InputParserDouble.inp_par_dou("Enter y. ");

		m = InputParserDouble.inp_par_dou("Enter m. ");

		n = InputParserDouble.inp_par_dou("Enter n. Do not foget that n > m. ");
		
		if (n <= m) {

			System.out.println("Your data is incorrect ");

		}

		else {

			boolean res = (x > m) && (x < n);

			System.out.println(res);

		}

	}

}
