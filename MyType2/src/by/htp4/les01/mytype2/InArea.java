package by.htp4.les01.mytype2;

public class InArea {

	public static boolean in_ar(double x, double y, int x1, int y1, int x2, int y2) {

		boolean res = false;

		if ((x >= x1) && (x <= x2)) {

			if ((y >= y1) && (y <= y2)) {

				res = true;
			}

		}

		return res;
	}

}
