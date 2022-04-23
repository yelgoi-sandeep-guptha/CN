package M3.L28;

public class ReturnSubSetArray {

    private static int[][] subset(int[] input, int si) {
        if (input.length == si) {
            int[][] output = new int[1][0];
            return output;
        }

        int[][] smallOutput = subset(input, si + 1);
        int[][] output = new int[smallOutput.length * 2][];

        int k = 0;
        for (int i = 0; i < smallOutput.length; i++) {
            output[k++] = smallOutput[i];

            output[k] = new int[smallOutput[i].length + 1];
            output[k][0] = input[si];
            for (int j = 0; j < smallOutput[i].length; j++) {
                output[k][j + 1] = smallOutput[i][j];
            }
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = { 10, 20, 30, };
        System.out.println("The SubSets of an array is : ");
        int[][] ans = subset(input, 0);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
