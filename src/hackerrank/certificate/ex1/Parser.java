package hackerrank.certificate.ex1;

import java.util.Stack;

class Parser {
    public String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ourString = s.toCharArray();
        for (int i = 0; i < ourString.length; i++) {
            if(ourString[i] == '(' || ourString[i] == '[' || ourString[i] == '{'){
                stack.push(ourString[i]);
            }else {
                if(stack.isEmpty()){
                    return "false";
                }
                switch (stack.peek()){
                    case '(': {
                        if (ourString[i] != ')')
                            return "false";
                        stack.pop();
                    }break;

                    case '[': {
                        if (ourString[i] != ']')
                            return "false";
                        stack.pop();
                    }break;

                    case '{': {
                        if (ourString[i] != '}')
                            return "false";
                        stack.pop();
                    }break;
                }
            }
        }

        if(!stack.isEmpty()){
            return "false";
        }
        return "true";
    }
}