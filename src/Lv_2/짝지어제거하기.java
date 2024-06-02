package Lv_2;

import java.util.Stack;

public class 짝지어제거하기 {
    public static void main(String[] args) {
        Solution9 solution9 = new Solution9();
        System.out.println(solution9.solution("baabaa"));
    }
}

class Solution9 {
    public int solution(String s) {
        int answer = 0;
        char[] carr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < carr.length; i++) {
            char c = carr[i];
            if (stack.isEmpty()) stack.push(c);
            else {
                if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}