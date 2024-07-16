package backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class 그룹단어체크 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;

        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {
            Stack<Character> stack = new Stack<>();
            String str = sc.next();
            List<Character> list = new ArrayList<>();
            for (int j = 0; j < str.length(); j++) {
                if (stack.isEmpty()) {
                    stack.push(str.charAt(j));
                    list.add(str.charAt(j));
                } else if (stack.peek() == str.charAt(j)) {
                    if (list.contains(str.charAt(j))) {
                        continue;
                    } else {
                        list.add(str.charAt(j));
                    }
                } else if (stack.peek() != str.charAt(j)) {
                    if (list.contains(str.charAt(j))) {
                        list.clear();
                        break;
                    }
                    list.add(stack.pop());
                    stack.push(str.charAt(j));
                }
            }
            if (!list.isEmpty()) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
