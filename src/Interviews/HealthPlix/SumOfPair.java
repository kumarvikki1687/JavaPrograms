/*
You are given an array of N integers, you want to group the numbers into pairs such that the sum of
the elements of each pair is the same. Each element can be a part of at most 1 pair. It is not
necessary for all the elements to be part of some pair. Determine the maximum number of pairs
such that the sum of the elements is the same for all pairs.

Input
N = 5
arr = [1, 2, 6, 6, 5]

Output
2   (1,6) (2,5)

*/

package Interviews.HealthPlix;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SumOfPair {

    static void prepareSumPair(int arr[], HashMap<Integer, HashSet<Integer>> mp) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                int sum =  arr[i] + arr[j];
                HashSet<Integer> tmp;
                if (mp.get(sum) == null) {
                    tmp = new HashSet<>();
                } else {
                    tmp = mp.get(sum);
                }
                tmp.add(arr[i]);
                tmp.add(arr[j]);
                mp.put(sum, tmp);
            }
        }
    }

    static int getMaxNoOfPair(int arr[]) {

        HashMap<Integer, HashSet<Integer>> mp = new HashMap<>();

        prepareSumPair(arr, mp);

        int maxi = -1;
        for(Map.Entry<Integer, HashSet<Integer>> iterator : mp.entrySet()) {
            HashSet<Integer> tmp = iterator.getValue();
            maxi = Math.max(maxi, tmp.size()/2);
        }
        return maxi;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 6, 6, 5};
        System.out.println(getMaxNoOfPair(arr));
    }
}
