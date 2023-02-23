package Problems;

import java.util.Stack;

public class BalancedParentheses {

    static String checkForBalancedParentheses(String input) {
        Stack<Character> stk = new Stack();

        for(int i=0;i<input.length();i++) {
            char x = input.charAt(i);

            if(x == '[' || x == '(' || x == '{') {
                stk.push(x);
                continue;
            }
            if (stk.isEmpty()) {        // if first character is closing bracket
                return "NotBalanced";
            }
            char peek = stk.peek();
            if((peek == '[' && x == ']') || (peek == '(' && x == ')') || (peek == '{' && x == '}')) {
                stk.pop();
                continue;
            }
            stk.push(x);
        }
        if (!stk.isEmpty()) {
            return "NotBalanced";
        } else {
            return "Balanced";
        }
    }

    public static void main(String[] args) {

        String input = "{()}[]";

        System.out.println(checkForBalancedParentheses(input));
    }
}
