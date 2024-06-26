package Lv_2;

import java.util.Arrays;

public class n2배열자르기 {
    public static void main(String[] args) {
        Solution19 solution19 = new Solution19();
        System.out.println(Arrays.toString(solution19.solution(3, 2, 5)));
    }
}

class Solution19 {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int) right - (int) left + 1];
        int idx = 0;
        for (long i = left; i <= right; i++) {
            answer[idx] = (int) (Math.max(i / n, i % n) + 1);
            idx++;
        }


        return answer;
    }
}