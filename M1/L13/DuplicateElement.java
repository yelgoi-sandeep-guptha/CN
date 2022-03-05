package M1.L13;

import java.util.Arrays;

public class DuplicateElement {

    private static int findDuplicate(int[] arr) {

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                return arr[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 3, 1, 5, 4, 3, 2 };
        System.out.println("The Duplicate element in the array is " + findDuplicate(arr));
    }
}
