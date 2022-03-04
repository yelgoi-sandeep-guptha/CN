package M1.L11;

public class Spiral {

    private static void spiral(int[][] arr) {
        int nRows = arr.length;
        if (nRows == 0) {
            return;
        }
        int mCols = arr[0].length;
        int rowStart = 0;
        int rowEnd = mCols - 1;
        int colStart = 0;
        int colEnd = mCols - 1;

        while ((rowStart <= rowEnd) || (colStart <= colEnd)) {

            // for printing top elements
            for (int top = colStart; top <= colEnd; top++) {
                System.err.print(arr[rowStart][top]+" ");
            }
            rowStart++;

            // for printing right elements
            for (int right = rowStart; right <= rowEnd; right++) {
                System.out.print(arr[right][colEnd]+" ");
            }
            colEnd--;

            // for printing bottom elements
            for (int bottom = colEnd; bottom >= colStart; bottom--) {
                System.out.print(arr[rowEnd][bottom]+" ");
            }
            rowEnd--;

            // for printinf left elements
            for (int left = rowEnd; left >= rowStart; left--) {
                System.out.print(arr[colStart][left]+" ");
            }
            colStart++;
        }
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        spiral(arr);
    }
}
