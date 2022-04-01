package M2.Test4;

public class Print2DArray {
    private static void print2DArray(int[][] arr) {
        int rows = arr.length;
        if (rows <= 0) {
            return;
        }
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j >= 1; j--) {
                for (int j2 = 0; j2 < cols; j2++) {
                    System.out.print(arr[i][j2] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        print2DArray(arr);
    }
}