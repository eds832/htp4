package by.htp4.les01.mytype2;

public class Task3 {

	public static void main(String[] args) {

		int d;
		int digit;
		int res;

		d = InputParserInteger.inp_par_int("Enter Four-digit integer number. ");

		digit = NumberDigit.num_dig(d);

		if (digit == 4) {

			res = 1;

			res = res * (d / 1000);
			
			d = d % 1000;
			
			res = res * (d / 100);
			
			d = d % 100;
			
			res = res * (d / 10);
			
			d = d % 10;
			
			res = res * d;

			System.out.print("Your result is " + res);

		}

		else {

			System.out.print("You entered incorrect number");

		}

	}

}
