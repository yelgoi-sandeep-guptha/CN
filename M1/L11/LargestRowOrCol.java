package M1.L11;

public class LargestRowOrCol {

    

    private static void findlargestRowCol(int[][] arr) {
        boolean isRow = true;
        int largestSum = Integer.MIN_VALUE;
        int num = 0;

        int nRows = arr.length;
        if(nRows == 0){
            System.out.println("row "+num+" "+largestSum);
            return;
        }
        int mCols = arr[0].length;

        for (int i = 0; i < nRows; i++) {
            int rowSum = 0;
            for (int j = 0; j < mCols; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum>largestSum) {
                largestSum = rowSum;
                num = i;
            }
        }

        for (int i = 0; i < mCols; i++) {
            int colSum = 0;
            for (int j = 0; j < nRows; j++) {
                colSum += arr[i][j];
            }
            if(largestSum<colSum){
                largestSum = colSum;
                isRow = false;
                num = i;
            }
        }

        if(isRow){
            System.out.println("row " +num+" "+largestSum);
        }else{
            System.out.println("Column " +num+" "+largestSum);
        }
    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        findlargestRowCol(arr);
    }
}
