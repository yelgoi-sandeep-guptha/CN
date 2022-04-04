package M2.L17;

import java.util.Scanner;

public class Polynomial {

    int degCoeff[];

    Polynomial() {
        degCoeff = new int[10];
    }

    public void doubleCapacity() {
        int temp[] = degCoeff;
        degCoeff = new int[2 * temp.length];
        for (int i = 0; i < temp.length; i++) {
            degCoeff[i] = temp[i];
        }
    }

    public void setCoeff(int degree, int coeff) {
        if (degree > degCoeff.length - 1) {
            doubleCapacity();
        }
        degCoeff[degree] = coeff;
    }

    public void print() {
        for (int i = 0; i < degCoeff.length; i++) {
            if (degCoeff[i] != 0) {
                System.out.print(degCoeff[i] + "x" + i + " ");
            }
        }
    }

    public Polynomial add(Polynomial p) {
        Polynomial ans = new Polynomial();
        int polyLen1 = p.degCoeff.length;
        int polyLen2 = this.degCoeff.length;
        int len = Math.min(polyLen1, polyLen2);

        int i;
        for (i = 0; i < len; i++) {
            ans.setCoeff(i, this.degCoeff[i] + p.degCoeff[i]);
        }
        while (i < polyLen1) {
            ans.setCoeff(i, p.degCoeff[i]);
        }
        while (i < polyLen2) {
            ans.setCoeff(i, this.degCoeff[i]);
        }
        return ans;
    }

    public Polynomial sub(Polynomial p) {
        Polynomial ans = new Polynomial();
        int polyLen1 = p.degCoeff.length;
        int polyLen2 = this.degCoeff.length;
        int len = Math.min(polyLen1, polyLen2);

        int i;
        for (i = 0; i < len; i++) {
            ans.setCoeff(i, this.degCoeff[i] - p.degCoeff[i]);
        }
        while (i < polyLen1) {
            ans.setCoeff(i, -p.degCoeff[i]);
        }
        while (i < polyLen2) {
            ans.setCoeff(i, this.degCoeff[i]);
        }
        return ans;
    }

    public int getCoff(int degree) {
        if (degree < this.degCoeff.length) {
            return degCoeff[degree];
        } else {
            return 0;
        }
    }

    public Polynomial mul(Polynomial p) {
        Polynomial ans = new Polynomial();
        for (int i = 0; i < this.degCoeff.length; i++) {
            for (int j = 0; j < p.degCoeff.length; j++) {
                int termdeg = i + j;
                int termCoeff = this.degCoeff[i] * p.degCoeff[j];
                int oldEff = ans.getCoff(termdeg);
                ans.setCoeff(termdeg, termCoeff + oldEff);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] degree1 = new int[n];
        for (int i = 0; i < n; i++) {
            degree1[i] = s.nextInt();
        }
        int[] coeff1 = new int[n];
        for (int i = 0; i < n; i++) {
            coeff1[i] = s.nextInt();
        }

        Polynomial p1 = new Polynomial();

        for (int i = 0; i < n; i++) {
            p1.setCoeff(degree1[i], coeff1[i]);
        }

        n = s.nextInt();
        int[] degree2 = new int[n];
        for (int i = 0; i < n; i++) {
            degree2[i] = s.nextInt();
        }
        int[] coeff2 = new int[n];
        for (int i = 0; i < n; i++) {
            coeff2[i] = s.nextInt();
        }

        Polynomial p2 = new Polynomial();

        for (int i = 0; i < n; i++) {
            p2.setCoeff(degree2[i], coeff2[i]);
        }

        int choice = s.nextInt();

        Polynomial result;
        switch (choice) {
            case 1: // add
                result = p1.add(p2);
                result.print();
                break;
            case 2: // sub
                result = p1.sub(p2);
                result.print();
                break;
            case 3:
                result = p1.mul(p2);
                result.print();
                break;
            default:
                break;
        }
        s.close();
    }
}
