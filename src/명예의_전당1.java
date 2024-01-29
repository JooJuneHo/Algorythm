import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 명예의_전당1 {
    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(solution53.solution(3, score)));
    }
}


class Solution53 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        List<Integer> rank = new ArrayList<>();

        for(int i=0; i< score.length; i++){
            rank.add(score[i]);

            if(rank.size() > k){
                rank.remove(Collections.min(rank));
            }

            answer[i] = Collections.min(rank);
        }

        return answer;
    }
}