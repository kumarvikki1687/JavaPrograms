package Problems;

import java.util.Scanner;

public class PalindromeWithoutString {

    boolean checkForPalindrome(int num) {
        int originalNum = num;
        int reverseNum = 0;

        while (num>0) {
            int rem = num%10;
            reverseNum = reverseNum*10 + rem;
            num/=10;
        }
        return originalNum == reverseNum;
    }

    public static void main(String[] args) {

        PalindromeWithoutString ob = new PalindromeWithoutString();
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(ob.checkForPalindrome(num));
    }
}
