package hackerrank.hackerrankInterviewPreparation.day5;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Result {
    public static void main(String[] args) {
        isBalanced("}][}}(}][))]");
        isBalanced("[](){()}");
        isBalanced("()");
        isBalanced("({}([][]))[]()");
        isBalanced("{)[](}]}]}))}(())(");
        isBalanced("([[)");
    }

    public static String isBalanced(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        char[] sequence = s.toCharArray();
        Stack<Character> ourStack = new Stack<>();
        for (char bracket : sequence) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                ourStack.push(bracket);
            } else {
                if (ourStack.isEmpty() || map.get(bracket) != ourStack.pop())
                    return "NO";
            }
        }
        return ourStack.isEmpty() ? "YES" : "NO";


    }


}
