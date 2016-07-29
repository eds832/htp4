package by.htp4.les01.mytype2;

import java.util.Scanner;

public class InputParserDouble {

	public static double inp_par_dou(String prom) {

		double inp = 0.0;

		String trash;

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		System.out.println(prom + "Enter number ");

		while (!sc.hasNextDouble()) {

			trash = sc.next();

			System.out.println(trash + " Incorrect. Try again.");

		}

		inp = sc.nextDouble();

		return inp;

	}

}
