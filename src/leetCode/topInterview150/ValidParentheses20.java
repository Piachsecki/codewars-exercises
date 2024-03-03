package leetCode.topInterview150;

import java.util.Stack;

//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
// determine if the input string is valid.
//
//An input string is valid if:
//
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
//
//
//Example 1:
//
//Input: s = "()"
//Output: true
//Example 2:
//
//Input: s = "()[]{}"
//Output: true
//Example 3:
//
//Input: s = "(]"
//Output: false
public class ValidParentheses20 {
    public static void main(String[] args) {
//        System.out.println(isValid("()"));
//        System.out.println(isValid("()[]{}"));
//        System.out.println(isValid("(]"));
        System.out.println(isValid("(){}}{"));
    }

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' || chars[i] == '{') {
                stack.push(chars[i]);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                switch (stack.peek()) {
                    case '(': {
                        if (chars[i] != ')')
                            return false;
                        stack.pop();
                    }
                    break;

                    case '[': {
                        if (chars[i] != ']')
                            return false;
                        stack.pop();
                    }
                    break;

                    case '{': {
                        if (chars[i] != '}')
                            return false;
                        stack.pop();
                    }
                    break;
                }
            }

        }

        return stack.isEmpty();
    }
}
