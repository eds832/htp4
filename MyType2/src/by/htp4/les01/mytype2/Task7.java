package by.htp4.les01.mytype2;

public class Task7 {

	public static void main(String[] args) {

		double x;
		double y;
		boolean area1;
		boolean area2;
		int r1 = 4;
		int r2 = 5;
		boolean result;

		x = InputParserDouble.inp_par_dou("Enter x. ");

		y = InputParserDouble.inp_par_dou("Enter y. ");

		area1 = false;

		if ((x >= 0) && (y >= 0)) {

			area1 = InSycle.in_sy(x, y, r1);
		}

		area2 = false;

		if ((x >= 0) && (y <= 0)) {

			area2 = InSycle.in_sy(x, y, r2);
		}

		result = area1 || area2;

		System.out.println(result);

	}

}
