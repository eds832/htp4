package by.htp4.les01.mytype2;

public class Task19 {

	public static void main(String[] args) {

		double e;
		double area;
		double Surface;
		double vol;

		e = InputParserDouble.inp_par_dou("Enter edge. ");

		if (e >= 0) {

			area = e * e;

			System.out.println("The surface of area of the cube is " + area);

			Surface = 6.0 * area;

			System.out.println("The surface of the cube is " + Surface);

			vol = e * area;

			System.out.println("The volume of the cube is " + vol);

		}

		else {

			System.out.print("Incorrect ");

		}

	}

}
