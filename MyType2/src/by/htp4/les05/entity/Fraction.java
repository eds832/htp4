package by.htp4.les05.entity;

public class Fraction {
	
    private int ch;

    private int zn;

    public Fraction() {

         ch = 1;

         zn = 1;

    }

    public Fraction(int ch, int zn) {

         this.zn = zn;

         this.ch = ch;

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

}
