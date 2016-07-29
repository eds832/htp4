package by.htp4.les01.mytype2;

public class Task17 {

	public static void main(String[] args) {

		int n;
		int digit;
		boolean res;
		int num_dig = 2;
		int base = 2;

		n = InputParserInteger.inp_par_int("");

		digit = NumberDigit.num_dig(n);

		res = ((digit == num_dig) && (n % base == 0));

		System.out.print("Your result is " + res);

	}

}
