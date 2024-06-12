package Lv_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        Solution16 solution16 = new Solution16();
        System.out.println(Arrays.toString(solution16.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
    }
}

class Solution16 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        int round = 0;
        int number;
        for (int i = 0; i < words.length; i++) {
            if (list.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }

            list.add(words[i]);

            if (i > 0 && words[i - 1].charAt(words[i - 1].length() - 1) != words[i].charAt(0)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;
    }
}