package Problems;

public class MajorityElement {

    boolean isMajorElement(int arr[], int majElement) {
        int majElementFre = 0;
        for (int element : arr) {
            if (element == majElement) {
                majElementFre++;
            }
        }
        return majElementFre > arr.length / 2;
    }

    int getMajorityElement(int arr[]) {
        int majElement = arr[0];
        int majCount = 1;
        for(int element : arr) {
            if(majElement==element) {
                majCount++;
            }
            else {
                majCount--;
                if(majCount==0) {
                    majElement = element;
                    majCount = 1;
                }
            }
        }
        if(isMajorElement(arr, majElement)) {
            return majElement;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

        MajorityElement ob = new MajorityElement();

        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println("Majority Element: " + ob.getMajorityElement(arr));
    }
}
