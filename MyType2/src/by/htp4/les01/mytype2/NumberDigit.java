package by.htp4.les01.mytype2;

public class NumberDigit {

	public static int num_dig(int d) {

		int base = 10;
		int digit = 1;

		while (d / base != 0) {

			base = base * 10;

			digit++;
		}
		return digit;
	}

}
