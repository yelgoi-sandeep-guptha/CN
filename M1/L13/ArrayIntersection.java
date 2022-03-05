package M1.L13;

import java.util.Arrays;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {2,6,8,5,4,3};
        int[] arr2 = {3,4,7,2};
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int s1 =0;
        int s2 = 0;

        while(s1<arr1.length && s2<arr2.length){
            if(arr1[s1]==arr2[s2]){
                System.out.println(arr1[s1]);
                s1++;
                s2++;
            }else if(arr1[s1]>arr2[s2]){
                s2++;
            }else{
                s1++;
            }
        }
    }
}
