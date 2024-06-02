package Lv_2;

public class 피보나치수 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.solution(3));
    }
}

class Solution8 {
    public int solution(int n) {
        int[] answer = new int[n + 1];
        answer[0] = 0;
        answer[1] = 1;

        for (int i = 2; i <= n; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }

        return answer[n];
    }
}
