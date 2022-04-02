package M2.L17;

import java.util.Scanner;

//Simplify the Fraction
public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        simplify();
    }

    private void simplify() {
        int gcd = 1;
        int smaller = Math.min(numerator, denominator);

        for (int i = 2; i <= smaller; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }

        this.numerator = this.numerator / gcd;
        this.denominator = this.denominator / gcd;
    }

    public void print() {
        System.out.println(this.numerator + "/" + denominator);
    }

    public void add(Fraction f) {
        this.numerator = this.numerator * f.denominator + this.denominator * f.numerator;
        this.denominator = this.denominator * f.denominator;
        simplify();
    }

    public void increment() {
        this.numerator = this.numerator + this.denominator;
        simplify();
    }

    public void sub(Fraction f) {
        this.numerator = this.numerator * f.denominator - this.denominator * f.numerator;
        if(this.numerator == 0){
            this.denominator = 0;
        }else{
            this.denominator = this.denominator * f.denominator;
        }
        simplify();
    }

    private static Fraction mul(Fraction f1, Fraction f2) {
        int newNum = f1.numerator * f2.numerator;
        int newDeno = f1.denominator * f2.denominator;
        Fraction f3 = new Fraction(newNum, newDeno);
        return f3;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1 = s.nextInt();
        int deno1 = s.nextInt();

        int num2 = s.nextInt();
        int deno2 = s.nextInt();

        Fraction f1 = new Fraction(num1, deno1);
        Fraction f2 = new Fraction(num2, deno2);

        int choice = s.nextInt();

        switch (choice) {
            case 1:
                f1.add(f2);
                f1.print();
                break;
            case 2:
                f1.sub(f2);
                f1.print();
                break;
            case 3:
                f1.increment();
                f1.print();
                break;
            case 4:
                Fraction f3 = Fraction.mul(f1, f2);
                System.out.println(f3.numerator + "/" + f3.denominator);
                break;
        }
        s.close();
    }
}
