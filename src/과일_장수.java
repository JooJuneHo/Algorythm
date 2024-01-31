import java.util.Arrays;

public class 과일_장수 {
    public static void main(String[] args) {
        Solution56 solution56 = new Solution56();
        int[] score = {4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        System.out.println(solution56.solution(4,3,score));

    }

}

class Solution56 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);


        for(int i = score.length; i >= m; i -= m){

            answer += score[i - m] * m;
        }


        return answer;
    }
}