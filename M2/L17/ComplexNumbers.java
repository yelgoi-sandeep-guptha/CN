package M2.L17;

import java.util.Scanner;

public class ComplexNumbers {
    private int real;
    private int imaginary;

    ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void print() {
        System.out.println(real + " + i" + imaginary);
    }

    void plus(ComplexNumbers c2) {
        this.real = this.real + c2.real;
        this.imaginary = this.imaginary + c2.imaginary;
    }

    void mul(ComplexNumbers c2) {
        int tempreal = this.real;
        this.real = this.real * c2.real - this.imaginary * c2.imaginary;
        this.imaginary = tempreal * c2.imaginary + this.imaginary * c2.real;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int real1 = s.nextInt();
        int imaginary1 = s.nextInt();

        int real2 = s.nextInt();
        int imaginary2 = s.nextInt();

        ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
        ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

        int choice = s.nextInt();

        if (choice == 1) {
            c1.plus(c2);
            c1.print();
        } else if (choice == 2) {
            c1.mul(c2);
            c1.print();
        }
        s.close();
    }
}
