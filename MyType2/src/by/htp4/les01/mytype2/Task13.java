package by.htp4.les01.mytype2;

import static java.lang.Math.sin;

public class Task13 {

	public static void main(String[] args) {

		double x;
		double f;

		x = InputParserDouble.inp_par_dou("Enter x. ");

		f = func(x);

		System.out.print("F(x) = " + f);

	}

	private static double func(double x) {

		double f;

		if (x <= 3) {

			f = x * x + 3.0 * x + 9.0;

		}

		else {

			f = sin(x) / (x * x - 9.0);

		}

		return f;

	}

}
