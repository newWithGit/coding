package dataStructure;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        isBalanced(bracket);
    }

    private static String isBalanced(String s) {
        char[] brackets = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        String no = "NO";
        for (char c: brackets) {
            switch (c) {
                case '(' :
                case '{' :
                case '[' :
                    stack.push(c);
                    break;
                case ')' :
                    if (stack.isEmpty() || stack.pop() != '(')
                        return no;
                    break;
                case '}' :
                    if (stack.isEmpty() || stack.pop() != '(')
                        return no;
                    break;
                case ']' :
                    if (stack.isEmpty() || stack.pop() != '(')
                        return no;
                    break;
            }

        }
        //System.out.println(brackets);
        return "Yes";
    }

    private static String bracket = " ";
}
