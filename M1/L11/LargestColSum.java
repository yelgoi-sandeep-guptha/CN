package M1.L11;

import java.util.Scanner;

public class LargestColSum {

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

    private static void largestColSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int largest = Integer.MIN_VALUE;

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum += arr[i][j];
            }
            if (largest < sum) {
                largest = sum;
            }
        }
        System.out.println("The largest column sum is : " + largest);
    }

    public static void main(String[] args) {
        int[][] arr = takeInput();
        largestColSum(arr);
    }
}
