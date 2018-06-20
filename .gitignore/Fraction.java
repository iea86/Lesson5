package by.epam.javabasic25.classes;


public class Fraction {

    private int n;
    private int d;


    public Fraction() {}


    public Fraction(int n, int d) {
        this.n = n;
        this.d = d;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getD() {
        return d;
    }

    public void setDivider(int d) {
        this.d = d;
    }

}