package by.htp4.les01.mytype2;

public class Task15 {

	public static void main(String[] args) {

		int m;
		int y;

		m = InputParserInteger.inp_par_int("Enter number of month. ");

		y = InputParserInteger.inp_par_int("Enter year betwin 1582 and 2600.");

		if ((y < 1582) || (y > 2600)) {

			System.out.println("Incorrect year");

		}

		else {

			switch (m) {

			case 1:

			case 3:

			case 5:

			case 7:

			case 8:

			case 10:

			case 12:

				System.out.println("31");

				break;

			case 2:

				if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0)) {

					System.out.println("29");

				}

				else {

					System.out.println("28");

				}

				break;

			case 4:

			case 6:

			case 9:

			case 11:

				System.out.println("30");

				break;

			default:

				System.out.println("Incorrect number ");

			}

		}

	}

}
