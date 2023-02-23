package Problems;

public class MaxNonAdjacentSum {

    int getMaxNonAdjacentSum(int arr[]) {
        int maxi = Integer.MIN_VALUE;
        int inc = arr[0];
        int exc = 0;

        for(int i=1;i<arr.length;i++) {
            int old_inc = inc;
            inc = exc + arr[i];
            exc = Math.max(exc, old_inc);
            maxi = Math.max(maxi, inc);
        }
        return maxi;
    }
    public static void main(String[] args) {

        MaxNonAdjacentSum ob = new MaxNonAdjacentSum();

        int arr[] = {5, 5, 10, 100, 10, 5};
        System.out.println("Max non-adj sum: " + ob.getMaxNonAdjacentSum(arr));
    }
}
