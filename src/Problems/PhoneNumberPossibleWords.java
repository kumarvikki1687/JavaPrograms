package Problems;

public class PhoneNumberPossibleWords {

    String phone[] = {"", "", "abc", "def", "ghi", "jkl","mno", "pqrs", "tuv", "wxyz"};

    void getPossibleWords(int arr[], int k, String word) {
        if(k==arr.length) {
            System.out.print(word + " ");
            return;
        }
        for(int i=0;i<phone[arr[k]].length();i++) {
            getPossibleWords(arr, k+1, word+phone[arr[k]].charAt(i));
        }
    }

    public static void main(String[] args) {
        PhoneNumberPossibleWords ob = new PhoneNumberPossibleWords();

        int arr[] = {2,3,4};
        ob.getPossibleWords(arr,0, "");
    }
}
