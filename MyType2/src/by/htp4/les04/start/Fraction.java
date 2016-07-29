package by.htp4.les04.start;

import static java.lang.Math.pow;

public class Fraction {

	private int ch;// поле экземпл€ра класса
	private int zn;// поле экземпл€ра класса

	private static double PI;// поле класса

	public Fraction() {// конструктор(всегда имеет им€ класса) - дл€ начальной
						// базовой инициализации
						// объектов - присвоени€ им начальных значений (параметров)
		ch = 1;// если не написать этого конструктора, то по умолчанию
				// компил€тор
		zn = 1;// создаст такой, но без начальных параметров
	}

	public Fraction(int ch, int zn) {// конструктор с параметрами типа int
		// может иметь и другие разные параметры, пример - public Fraction(char
		// ch, int zn)
		this.ch = ch;
		this.zn = zn;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}

	public int getZn() {
		return zn;
	}

	public void setZn(int zn) {
		this.zn = zn;
	}

	public boolean isSimple() {
		if (CommonDivisor() == 1) {
			return true;
		} else {
			return false;
		}
	}

	public Fraction add(Fraction f) {

		int newCh;
		int newZn;

		newZn = zn * f.getZn();
		newCh = ch * f.getZn() + f.getCh() * zn;

		return new Fraction(newCh, newZn);
	}

	public Fraction sub(Fraction f) {

		int newCh;
		int newZn;

		newZn = zn * f.getZn();
		newCh = f.getCh() * zn - ch * f.getZn();

		return new Fraction(newCh, newZn);
	}

	public Fraction mult(Fraction f) {

		int newCh;
		int newZn;

		newZn = zn * f.getZn();
		newCh = ch * f.getCh();

		return new Fraction(newCh, newZn);
	}

	public Fraction devide(Fraction f) {

		int newCh;
		int newZn;

		newZn = zn * f.getCh();
		newCh = ch * f.getZn();

		return new Fraction(newCh, newZn);
	}

	public Fraction pow(Fraction f, int value) {

		int newCh;
		int newZn;

		newCh = (int) Math.pow(ch, value);
		newZn = (int) Math.pow(zn, value);

		return new Fraction(newCh, newZn);
	}

	private int CommonDivisor() {

		int nod = 1;
		int min;

		if (ch > zn) {
			min = zn;
		} else {
			min = ch;
		}

		for (int i = min; i > 0; i--) {
			if ((ch % i == 0) && (zn % i == 0)) {
				nod = i;
				break;
			}
		}
		return nod;
	}

	public Fraction toSimple() {

		int newCh;
		int newZn;
		if (isSimple()) {
			newZn = zn;
			newCh = ch;

			return new Fraction(newCh, newZn);
		} else {
			int nod = 1;
			int min;

			if (ch > zn) {
				min = zn;
			} else {
				min = ch;
			}

			for (int i = min; i > 0; i--) {
				if ((ch % i == 0) && (zn % i == 0)) {
					nod = i;
					break;
				}
			}

			newZn = zn / nod;
			newCh = ch / nod;

			return new Fraction(newCh, newZn);
		}
	}

	public int intPartOf_Fraction() {
		int part;
		toSimple();
		if (ch > zn) {
			part = ch / zn;
		} else {
			part = 0;
		}

		return part;
	}
}
