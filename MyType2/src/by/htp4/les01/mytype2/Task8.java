package by.htp4.les01.mytype2;

public class Task8 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		a = InputParserDouble.inp_par_dou("Enter a. ");

		b = InputParserDouble.inp_par_dou("Enter b. ");

		c = InputParserDouble.inp_par_dou("Enter c. ");

		if ((a <= 0) || (b <= 0) || (c <= 0)) {

			System.out.println("Incorrect ");

		}

		else {

			if (((a + b) > c) && ((a + c) > b) && ((c + b) > a)) {

				System.out.println("The triangle exist ");
			}

			else {

				System.out.println("The triangle does not exist ");

			}

		}

	}

}
