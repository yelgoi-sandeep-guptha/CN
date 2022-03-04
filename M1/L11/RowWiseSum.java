package M1.L11;

import java.util.Scanner;

public class RowWiseSum {

    private static int[][] takeInput() {
        int[][] arr;
        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter Number of rows : ");
            int rows = s.nextInt();
            System.out.print("Enter Number of columns : ");
            int cols = s.nextInt();

            arr = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print("Enter " + (i + 1) + "th row and " + (j + 1) + "th column element :");
                    int input = s.nextInt();
                    arr[i][j] = input;
                }
            }
        }
        return arr;
    }

    private static void rowWiseSum(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            System.out.println((i + 1) + "st row sum is: " + sum);
        }
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        rowWiseSum(arr);
    }
}