package Lv_2;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;


public class 최댓값과최솟값 {

    public static void main(String[] args) {
        Solution1 solution1 = new Solution1();
        System.out.println(solution1.solution("1 2 3 4"));
    }
}

class Solution1 {

    public String solution(String s) {
        String answer = "";

        String[] Arr = s.split(" ");

        int max = MIN_VALUE;
        int min = MAX_VALUE;

        for (int i = 0; i < Arr.length; i++) {
            int num = Integer.parseInt(Arr[i]);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }

        answer = min + " " + max;
        return answer;
    }
}