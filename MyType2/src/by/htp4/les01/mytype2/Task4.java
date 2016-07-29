package by.htp4.les01.mytype2;

public class Task4 {

	public static void main(String[] args) {

		double x;
		double y;

		x = InputParserDouble.inp_par_dou("Enter x. ");

		y = InputParserDouble.inp_par_dou("Enter y. ");

		sum(x, y);

		sub(x, y);

		mult(x, y);

		quot(x, y);

	}

	private static void sum(double x, double y) {

		double _sum;

		_sum = x + y;

		System.out.println("x + y = " + _sum);

	}

	private static void sub(double x, double y) {

		double _sub;

		_sub = x - y;

		System.out.println("x - y = " + _sub);

	}

	private static void mult(double x, double y) {

		double _mult;

		_mult = x * y;

		System.out.println("x * y =  " + _mult);

	}

	private static void quot(double x, double y) {

		double _quot;

		if (y != 0) {

			_quot = x / y;

			System.out.println("x / y = " + _quot);

		}

		else {

			System.out.println("Because (y = 0), (x / y) doesn't exist");

		}

	}

}
