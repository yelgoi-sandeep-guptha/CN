package M2.L15;

public class MergeSort {
    private static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int arr1[] = new int[arr.length / 2];
        int arr2[] = new int[arr.length - arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        for (int i = arr.length / 2; i < arr.length; i++) {
            arr2[i - arr.length / 2] = arr[i];
        }

        mergeSort(arr1);
        mergeSort(arr2);
        merge(arr1, arr2, arr);
    }

    public static void merge(int[] s1, int[] s2, int[] d) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < s1.length && j < s2.length) {
            if (s1[i] < s2[j]) {
                d[k++] = s1[i++];
            } else {
                d[k++] = s2[j++];
            }
        }

        while (i < s1.length) {
            d[k++] = s1[i++];
        }

        while (j < s2.length) {
            d[k++] = s2[j++];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 9, 6, 7, 2, 4, 1 };
        mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        // System.out.println("After sorting the array is "+ arr);
    }
}
