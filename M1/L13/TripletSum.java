package M1.L13;

import java.util.Arrays;

public class TripletSum {

    private static int tripletsSum(int[] arr, int num) {

        Arrays.sort(arr);

        int triplets = 0;

        for (int i = 0; i < arr.length; i++) {

            int si = i + 1;
            int ei = arr.length - 1;

            int pairsum = num - arr[i];
            int paircount = 0;

            while (si < ei) {
                if (arr[si] + arr[ei] < pairsum) {
                    si++;
                } else if (arr[si] + arr[ei] > pairsum) {
                    ei--;
                } else {

                    int elementAtStart = arr[si];
                    int elementAtEnd = arr[ei];

                    if (elementAtStart == elementAtEnd) {
                        int totalCount = (ei - si) + 1;
                        paircount += (totalCount * (totalCount - 1)) / 2;
                        break;
                    }

                    int tempsi = si + 1;
                    int tempei = ei - 1;

                    if (tempsi <= tempei && arr[tempsi] == elementAtStart) {
                        tempsi++;
                    }

                    if (tempsi <= tempei && arr[tempei] == elementAtEnd) {
                        tempei--;
                    }

                    int totalElementsFromStart = (tempsi - si);
                    int totalElementsFromEnd = (ei - tempei);

                    paircount += totalElementsFromEnd * totalElementsFromStart;

                    si = tempsi;
                    ei = tempei;
                }
            }
            triplets += paircount;
        }
        return triplets;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int num = 12;
        System.out.println("No of triplets "+tripletsSum(arr, num));
    }
}
