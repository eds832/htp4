package by.htp4.les01.mytype2;

import static java.lang.Math.sin;

public class Task21 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		String banner = "F(x) = x * sin(x)";

		a = InputParserDouble.inp_par_dou("Enter a. ");

		b = InputParserDouble.inp_par_dou("Enter b. Do not forget that b > a. ");

		if (b > a) {

			h = InputParserDouble.inp_par_dou("Enter h. Do not forget that h > 0. ");

			if (h > 0) {

				header(banner);

				body(a, b, h);

			}

			else {

				System.out.print("Incorrect ");

			}

		}

		else {

			System.out.print("Incorrect ");

		}

	}

	private static double func(double x) {

		double f;

		f = x * sin(x);

		return f;

	}

	private static void header(String banner) {

		System.out.println("--------------------------------------- ");

		System.out.println("|         x       | " + banner + " | ");

		System.out.println("--------------------------------------- ");

	}

	private static void body(double a, double b, double h) {
		
		double f;
		double x;

		for (x = a; x <= b; x += h) {

			f = func(x);

			System.out.printf("| %15.3f | %15.3f   |%n", x, f);

			System.out.println("--------------------------------------- ");

		}

	}

}
