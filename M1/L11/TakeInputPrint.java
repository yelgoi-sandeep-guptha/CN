package M1.L11;

import java.util.Scanner;

public class TakeInputPrint {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter Number of rows : ");
            int rows = s.nextInt();
            System.out.print("Enter Number of columns : ");
            int cols = s.nextInt();

            int[][] arr = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter " + (i + 1) + "th row and " + (j + 1) + "th column element :");
                    int input = s.nextInt();
                    arr[i][j] = input;
                }
            }
            System.out.println("The Elements of the array are :");

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
