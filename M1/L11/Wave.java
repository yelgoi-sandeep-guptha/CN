package M1.L11;

public class Wave {

    private static void wave(int[][] arr) {
        int nRows = arr.length;
        if(nRows==0){
            return;
        }
        int mCols = arr[0].length;

        for(int j=0;j<mCols;j++){
            if(j%2==0){
                for (int i = 0; i < nRows; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}}; 
        wave(arr);
    }
}
