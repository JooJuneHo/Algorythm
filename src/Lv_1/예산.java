package Lv_1;

import java.util.Arrays;

public class 예산 {

    public static void main(String[] args) {
        PracSolution3 solution3 = new PracSolution3();
        int[] d = {1, 3, 2, 5, 4};
        int budget = 9;
        System.out.println(solution3.solution(d, budget));
    }
}


class PracSolution3 {

    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if (budget < 0) {
                break;
            }
            answer++;
        }

        return answer;
    }
}