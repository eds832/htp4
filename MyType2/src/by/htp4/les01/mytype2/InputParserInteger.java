package by.htp4.les01.mytype2;

import java.util.Scanner;

public class InputParserInteger {

	public static int inp_par_int(String prom) {

		int inp = 0;

		String trash;

		@SuppressWarnings("resource")

		Scanner sc = new Scanner(System.in);

		System.out.println(prom + "Enter integer number ");

		while (!sc.hasNextInt()) {

			trash = sc.next();

			System.out.println(trash + " Incorrect. Try again.");

		}

		inp = sc.nextInt();

		return inp;

	}

}
