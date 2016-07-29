package by.htp4.les01.mytype2;

public class Task16 {

	public static void main(String[] args) {

		int d;
		int digit;
		int square;
		int d1;
		int d2;
		int sum;
		boolean res;

		d = InputParserInteger.inp_par_int("Enter three-digit integer number. ");

		digit = NumberDigit.num_dig(d);

		if (digit == 3) {

			square = d * d;

			d1 = d / 100;

			d = d % 100;

			d2 = d / 10;

			d = d % 10;

			sum = d + d2 + d1;

			res = (sum * sum * sum) == square;

			System.out.print("Your result is " + res);

		}

		else {

			System.out.print("You entered incorrect number");

		}

	}

}
