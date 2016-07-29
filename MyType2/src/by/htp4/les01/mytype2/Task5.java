package by.htp4.les01.mytype2;

import static java.lang.Math.*;

public class Task5 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double d;
		double x1;
		double x2;

		a = InputParserDouble.inp_par_dou("Enter a. ");

		b = InputParserDouble.inp_par_dou("Enter b. ");

		c = InputParserDouble.inp_par_dou("Enter c. ");

		d = (b * b) - (4 * a * c);

		if (a == 0) {

			x1 = -c / b;

			System.out.println("x1 = x2 = " + x1);

		}

		else {

			if (d < 0) {

				System.out.print("This equation has not desisions, because d = " + d);

			}

			else {

				if (d == 0) {

					x1 = (-b) / (2 * a);

					System.out.println("x = " + x1);

				}

				else {

					x1 = (-b + sqrt(d)) / (2 * a);

					x2 = (-b - sqrt(d)) / (2 * a);

					if (x1 == x2) {

						System.out.println("x1 = x2 = " + x1);

					}

					else {

						System.out.println("x1 =  " + x1 + "  x2 = " + x2);

					}

				}

			}

		}

	}

}
