package Lv_2;

import java.util.Arrays;

public class 최솟값만들기 {

    public static void main(String[] args) {
        Solution3 solution3 = new Solution3();
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(solution3.solution(A, B));
    }
}

class Solution3 {

    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[B.length - 1 - i];
        }

        return answer;
    }
}