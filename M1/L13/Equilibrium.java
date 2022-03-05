package M1.L13;

public class Equilibrium {
    private static int arrayEquilibriumIndex(int[] arr) {
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i < arr.length; i++) {
            rightSum += arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            leftSum = leftSum + arr[i - 1];
            rightSum = rightSum - arr[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 1, 6, 5, 3, 2, 5, 0, 5, 6, 0 };
        System.out.println("The Equlibruim index is " + arrayEquilibriumIndex(arr));
    }
}
