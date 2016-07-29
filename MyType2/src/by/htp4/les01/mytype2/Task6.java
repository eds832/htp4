package by.htp4.les01.mytype2;

public class Task6 {

	public static void main(String[] args) {

		int ar1_x1 = -2;
		int ar1_y1 = 0;
		int ar1_x2 = 2;
		int ar1_y2 = 4;
		int ar2_x1 = -4;
		int ar2_y1 = -3;
		int ar2_x2 = 4;
		int ar2_y2 = 0;
		double x;
		double y;
		boolean area1;
		boolean area2;
		boolean result;

		x = InputParserDouble.inp_par_dou("Enter x. ");

		y = InputParserDouble.inp_par_dou("Enter y. ");

		area1 = InArea.in_ar(x, y, ar1_x1, ar1_y1, ar1_x2, ar1_y2);

		area2 = InArea.in_ar(x, y, ar2_x1, ar2_y1, ar2_x2, ar2_y2);

		result = area1 || area2;

		System.out.println(result);

	}

}
