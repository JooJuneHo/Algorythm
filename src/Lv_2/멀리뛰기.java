package Lv_2;

public class 멀리뛰기 {
    public static void main(String[] args) {
        Solution15 solution15 = new Solution15();
        System.out.println(solution15.solution(4));
    }
}

class Solution15 {
    public long solution(int n) {
        long[] answer = new long[2021];

        answer[1] = 1;
        answer[2] = 2;

        for (int i = 3; i < 2001; i++) {
            answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567;
        }

        return answer[n];
    }


}