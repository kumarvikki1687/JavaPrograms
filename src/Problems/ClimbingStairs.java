package Problems;

import java.util.Scanner;

class ClimbingStairs {

    int getPossibleCombination(int n) {
        int arr[] = new int[n+1];
        if(n<=2) {
            return n;
        }
        if(n==3) {
            return 4;
        }
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;
        for(int i=4;i<=n;i++) {
            arr[i] = arr[i-1] + arr[i-2] + arr[i-3];
        }
        return arr[n];
    }

    public static void main(String args[]) {

        ClimbingStairs ob = new ClimbingStairs();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(ob.getPossibleCombination(n));
    }
}