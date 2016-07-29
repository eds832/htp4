package by.htp4.les01.mytype2;

public class Task11 {

	public static void main(String[] args) {

		double x1;
		double y1;
		double x2;
		double y2;
		double r1;
		double r2;

		x1 = InputParserDouble.inp_par_dou("Enter data for the point A.\nEnter x1. ");

		y1 = InputParserDouble.inp_par_dou("Enter y1. ");

		x2 = InputParserDouble.inp_par_dou("Enter data for the point B.\nEnter x2. ");

		y2 = InputParserDouble.inp_par_dou("Enter y2. ");

		r1 = x1 * x1 + y1 * y1;

		r2 = x2 * x2 + y2 * y2;

		if (r2 > r1) {

			System.out.println("The point A is the nearest to 0");

		}

		if (r1 > r2) {

			System.out.println("The point B is the nearest to 0");

		}

		if (r1 == r2) {

			System.out.println("The points A and B have the same distance to 0");

		}

	}

}
