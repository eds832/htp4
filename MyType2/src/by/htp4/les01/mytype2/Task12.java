package by.htp4.les01.mytype2;

public class Task12 {

	public static void main(String[] args) {

		double x;
		double f;

		x = InputParserDouble.inp_par_dou("Enter x. ");

		f = func(x);

		System.out.print("F(x) = " + f);
	}

	private static double func(double x) {

		double f;

		if ((x >= 0) && (x <= 3)) {

			f = x * x;

		}

		else {

			f = 4.0;

		}

		return f;

	}

}
