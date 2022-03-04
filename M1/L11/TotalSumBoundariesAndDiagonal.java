package M1.L11;

public class TotalSumBoundariesAndDiagonal {

    private static void sum(int[][] arr, int length) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(i==0 || j==0 || j==length-1 || i==length-1 || i==j || (i+j)==(length-1)){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("The sum of Boundaries and diagonals : "+sum);
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        sum(arr,arr.length);
    }

}
