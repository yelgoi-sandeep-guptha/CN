package M2.L15;

public class QuickSort {

    private static void quicksort(int[] arr, int si, int ei) {
        if (si > ei) {
            return;
        }
        int pivotIndex = partition(arr, si, ei);
        quicksort(arr, si, pivotIndex - 1);
        quicksort(arr, pivotIndex + 1, ei);
    }

    private static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    private static int partition(int[] arr, int si, int ei) {
        int pivotElement = arr[si];
        int count = 0;
        for (int i = si + 1; i <= ei; i++) {
            if (pivotElement > arr[i]) {
                count++;
            }
        }
        arr = swap(arr, si, si + count);

        int i = si;
        int j = ei;
        while (i < j) {
            if (arr[i] < pivotElement) {
                i++;
            } else if (arr[j] >= pivotElement) {
                j--;
            } else {
                arr = swap(arr, i, j);
            }
        }
        return si + count;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 9, 1, 5, 7, 6, 3 };
        quicksort(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}