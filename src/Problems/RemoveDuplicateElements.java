package Problems;

import java.util.HashMap;

public class RemoveDuplicateElements {
    public static void removeDuplicates(int arr[])
    {
        /*
        HashMap<Integer, Boolean> mp = new HashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(mp.get(arr[i]) == null) {
                System.out.print(arr[i] + " ");
                mp.put(arr[i],true);
            }
        }
        */

        int maxi = 0;
        for(int i=0;i<arr.length;i++) {
            maxi = Math.max(maxi, arr[i]);
        }
        int hash[] = new int[maxi];

        for(int i=0; i<arr.length; i++) {
            if(hash[arr[i]] == 0) {
                System.out.print(arr[i] + " ");
                hash[arr[i]]++;
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] = {5,2,6,8,6,7,5,2,8};

        removeDuplicates(arr);
    }
}
