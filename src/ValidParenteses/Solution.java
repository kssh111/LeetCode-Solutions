package src.ValidParenteses;

import java.util.Stack;

public class Solution {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // If it's an opening bracket, push it onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // If it's a closing bracket
            else {
                // Check if the stack is empty or the top doesn't match the closing bracket
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;

                }

            }

        }
        // If the stack is empty, all brackets were matched correctly
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([])";

        System.out.println(isValid(s1));  // Нәтиже: true
        System.out.println(isValid(s2));  // Нәтиже: true
        System.out.println(isValid(s3));  // Нәтиже: false
        System.out.println(isValid(s4));  // Нәтиже: true
    }
}


