package Problems;

class TrappingRainWater {

    int getMaxWaterTrapped(int arr[]) {

        int len = arr.length;
        int rslt = 0;

        int leftMaxArray[] = new int[len];
        int rightMaxArray[] = new int[len];

        leftMaxArray[0] = arr[0];
        rightMaxArray[len-1] = arr[len-1];

        for(int i=1;i<len;i++) {
            leftMaxArray[i] = Math.max(leftMaxArray[i-1], arr[i]);
        }

        for(int i=len-2;i>=0;i--) {
            rightMaxArray[i] = Math.max(rightMaxArray[i+1], arr[i]);
        }

        for(int i=0;i<len;i++) {
            rslt+=Math.abs(arr[i]-Math.min(leftMaxArray[i],rightMaxArray[i]));
        }
        return rslt;
    }
    public static void main(String[] args) {
        TrappingRainWater ob = new TrappingRainWater();
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Max water trapped: " + ob.getMaxWaterTrapped(arr));
    }
}
