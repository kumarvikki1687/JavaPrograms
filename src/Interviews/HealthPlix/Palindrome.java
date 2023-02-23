/*
minimum deletion to make string palindrome
 */

package Interviews.HealthPlix;

public class Palindrome {

    static int minToDelete = 1000000;

    static boolean checkForPalindrome(String str) {
        int hash[] = new int[26];
        for(int i=0;i<str.length();i++) {
            hash[str.charAt(i)-'a']++;
        }
        int foundOdd = 0;
        for(int i=0; i< 26;i++) {
            if(hash[i]%2!=0) {
                foundOdd++;
            }
            if(foundOdd>1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "abebfac";

        int n = input.length();

        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                String tmp = input.substring(0, i) + input.substring(j, n);
                if(checkForPalindrome(tmp)) {
                    if (minToDelete > n-tmp.length()) {
                        System.out.println(input.substring(i, j));
                        minToDelete  = n-tmp.length();
                    }
                }
            }
        }
        System.out.println(minToDelete);
    }
}
