package Problems;

public class Test {

    void displayArray(int arr[]) {
        for(int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    void modifyArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            arr[i]*=10;
        }
    }

    public static void main(String[] args) {
        Test ob = new Test();
        int arr[] = new int[5];
        for(int i=0;i<5;i++) {
            arr[i] = i+1;
        }
        ob.displayArray(arr);
        ob.modifyArray(arr);
        ob.displayArray(arr);
    }
}
