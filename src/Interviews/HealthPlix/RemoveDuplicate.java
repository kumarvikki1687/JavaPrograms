/*
remote duplicates in un-sorted and sorted arrays
 */

package Interviews.HealthPlix;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveDuplicate {

    static void removeDuplicateElements(int arr[]) {

        HashMap<Integer, Boolean> mp= new HashMap<>();

        for(int i=0; i<arr.length; i++) {
            if(mp.get(arr[i]) == null) {
                System.out.print(arr[i] + " ");
                mp.put(arr[i], true);
            }
        }
    }

    static void removeDuplicateInPlace(int arr[]) {

        int n = arr.length;
        int i=0;
        while (i<n-1) {
            if(arr[i] != arr[i+1]) {
                i++;
                continue;
            } else {
                if(i+2<n) {
                    int k = i+1;
                    int tmp = arr[k];
                    for(int j=i+2;j<n;j++) {
                        arr[k] = arr[j];
                        k++;
                    }
                    arr[n-1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {-1,3,6,-5,7,-9,8,3,6,-8,8,3,6};

        Arrays.sort(arr);

        removeDuplicateInPlace(arr);

        for(Integer element: arr) {
            System.out.print(element + " ");
        }
    }
}