package Lv_2;

import java.util.Arrays;

public class 이진변환반복하기 {
    public static void main(String[] args) {
        Solution5 solution5 = new Solution5();
        System.out.println(Arrays.toString(solution5.solution("110010101001")));
    }
}

class Solution5 {
    public int[] solution(String s) {
        int[] answer = new int[2];

        while (s.length() > 1) {
            int cntOne = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') answer[1]++;
                else cntOne++;
            }

            s = Integer.toBinaryString(cntOne);
            answer[0]++;
        }

        return answer;
    }
}