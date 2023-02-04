package Problems;

import java.util.Collections;
import java.util.Map;

public class MaxProductSubArray {

    int getProductSubArray(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        int currMax = arr[0];
        int currMin = arr[0];

        for(int i=1;i<arr.length;i++) {
            if(arr[i]<0) {
                int tmp = currMax;
                currMax = currMin;
                currMin = tmp;
            }
            currMax = Math.max(currMax * arr[i], arr[i]);
            currMin = Math.min(currMin * arr[i], arr[i]);
            maxi = Math.max(maxi,currMax);
        }
        return maxi;
    }
    public static void main(String[] args) {
        MaxProductSubArray ob = new MaxProductSubArray();

        int arr[] = {6, -3, -10, 0, 2};
        System.out.println("max product Sub-Array: " + ob.getProductSubArray(arr));
    }
}
