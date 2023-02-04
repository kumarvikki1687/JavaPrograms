package Problems;
import java.util.Scanner;
import java.util.Stack;

public class LowestNumberFromString {

    String getStringFromStack(Stack<Character> stk) {
        String output = "";
        boolean nonZeroFound = true;
        for(Character ch : stk) {
            if(ch == '0' && nonZeroFound==true) {
                continue;
            }
            nonZeroFound = false;
            output = output.concat(ch.toString());
        }
        return output;
    }

    String getLowestNumber(String input, int k) {
        int count = 0;
        Stack<Character> stk = new Stack();
        int i=0;
        while(i<input.length()) {
            if(stk.empty()) {
                stk.push(input.charAt(i));
                i++;
                continue;
            }
            while(!stk.empty() && stk.peek() > input.charAt(i) && count<k) {
                stk.pop();
                count++;
            }
            stk.push(input.charAt(i));
            i++;
        }
        while (count<k) {
            stk.pop();
            count++;
        }

        return getStringFromStack(stk);
    }

    public static void main(String[] args) {

        LowestNumberFromString ob = new LowestNumberFromString();

        System.out.print("Input String: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String output = ob.getLowestNumber(input,3);
        System.out.println("Lowest String: " + output);
    }
}
