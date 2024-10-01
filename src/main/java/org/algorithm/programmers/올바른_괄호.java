package org.algorithm.programmers;

import java.util.Stack;

public class 올바른_괄호 {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c == ')') {
                if(stack.isEmpty()) return false;
                else stack.pop();
            } else {
                stack.add(c);
            }
        }

        return stack.size() == 0;
    }
}
