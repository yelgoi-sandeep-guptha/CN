package M1.L13;
import java.util.Arrays;

public class PairSum {

    private static int pairSum(int[] arr, int k) {
        Arrays.sort(arr);
        int si = 0;
        int ei = arr.length-1;
        int numPairs = 0;

        while(si<ei){
            if(arr[si]+arr[ei]<k){
                si++;
            }else if(arr[si]+arr[ei]>k){
                ei--;
            }else{

                int elementAtStart = arr[si];
                int elementAtEnd = arr[ei];

                while(elementAtStart == elementAtEnd){
                    int totalElementsFromStartToEnd = (ei - si) + 1;
                    numPairs += (totalElementsFromStartToEnd*totalElementsFromStartToEnd-1)/2;
                    return numPairs;
                }

                int tempsi = si+1;
                int tempei = ei-1;

                while(tempsi<=tempei && arr[tempsi] == elementAtStart){
                    tempsi += 1;
                }

                while(tempsi<=tempei && arr[tempei] == elementAtEnd){
                    tempei -= 1;
                }

                int totalElementsFromStart = tempsi-si;
                int totalElementsFromEnd = ei-tempei;

                numPairs += (totalElementsFromStart * totalElementsFromEnd);

                si = tempsi;
                ei = tempei;
            }
        }
        return numPairs;
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,6,2,5,4,3,2,4};
        int k = 7;

        System.out.println(pairSum(arr,k));
        
    }
}
