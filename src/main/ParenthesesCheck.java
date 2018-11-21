package main;

import java.util.Stack;

public class ParenthesesCheck {

    public boolean isParentheseIsFine(String str){
        Stack<Character> stack = new Stack<>();
        char c;
        for(int i = 0; i < str.length(); i++){
            c = str.charAt(i);

            if(c == '(')
                stack.push(c);
            else if(c == ')')
                if(stack.isEmpty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else return false;
        }
        return stack.empty();
    }
}
