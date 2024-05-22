package Lv_2;

import java.util.Stack;

public class 올바른괄호 {

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        System.out.println(solution2.solution("()()"));
    }

}

// Stack
class Solution2 {

    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        if (!stack.isEmpty()) {
            return false;
        }

        return answer;
    }
}

// 완전 탐색
//class Solution2 {
//
//    boolean solution(String s) {
//        boolean answer = true;
//        int openCount = 0;
//        int closeCount = 0;
//
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == '(') {
//                openCount++;
//            } else if (s.charAt(i) == ')') {
//                closeCount++;
//            }
//            if (openCount < closeCount) {
//                answer = false;
//            }
//        }
//        if (openCount == closeCount) {
//            answer = true;
//        }
//        return answer;
//    }
//}