package M1.L13;

public class UniqueElement {

    private static int findUnique(int[] arr) {
        int unique = arr[0];

        for (int i = 1; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }

        return unique;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 1, 3, 6, 6, 7, 10, 7 };
        System.out.println("The unique Element in the array is " + findUnique(arr));
    }
}
