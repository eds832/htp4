package by.htp4.les04.start;

public class Start {

	public static void main(String[] args) {

		Fraction fr1 = new Fraction();// new Fraction() - создание конструкторa
										// без
										// параментров
		// Fraction fr1 - ссылка типа Fraction с именем fr1 на создаваемый
		// объект
		Fraction fr2 = new Fraction(3, 5);

		fr1.setCh(2);
		fr1.setZn(3);

		printFraction("fr1", fr1);
		printFraction("fr2", fr2);
		printFraction("fr1 + fr2", fr1.add(fr2));
		printFraction("fr1 - fr2", fr1.sub(fr2));
		printFraction("fr1 * fr2", fr1.mult(fr2));
		printFraction("fr1/fr2", fr1.devide(fr2));
		printFraction("fr1 ^ 2", fr1.pow(fr1, 2));
		if (fr1.isSimple()){
			System.out.println("The Fraction fr1 is simple.");
		} else {
			System.out.println("The Fraction fr1 does not simple.");
		}
		Fraction fr3 = new Fraction(40, 16);
		printFraction("fr3", fr3);
		if (fr3.isSimple()){
			System.out.println("The Fraction fr3 is simple.");
		} else {
			System.out.println("The Fraction fr3 does not simple.");
		}
		printFraction("40/16", fr3.toSimple());
		
		Fraction fr4 = new Fraction(40, 7);
		System.out.println("The integer part of the fraction 40/7 is " + fr4.intPartOf_Fraction());
	}

	private static void printFraction(String message, Fraction f) {
		System.out.print(message + " = ");
		System.out.println(f.getCh() + "/" + f.getZn());
	}

}