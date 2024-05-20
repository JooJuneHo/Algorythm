package Lv_1;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {

    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};
        System.out.println(solution12.solution(survey, choices));
    }
}

class Solution12 {

    public String solution(String[] survey, int[] choices) {
        String answer = "";

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < survey.length; i++) {
            int value = choices[i];

            if (value > 0 && value < 4) {
                map.put(survey[i].charAt(0), map.getOrDefault(survey[i].charAt(0), 0) + 4 - value);
            } else if (value > 4) {
                map.put(survey[i].charAt(1), map.getOrDefault(survey[i].charAt(1), 0) + value - 4);
            }
        }

        answer += map.getOrDefault('R', 0) >= map.getOrDefault('T', 0) ? "R" : "T";
        answer += map.getOrDefault('C', 0) >= map.getOrDefault('F', 0) ? "C" : "F";
        answer += map.getOrDefault('J', 0) >= map.getOrDefault('M', 0) ? "J" : "M";
        answer += map.getOrDefault('A', 0) >= map.getOrDefault('N', 0) ? "A" : "N";

        return answer;
    }
}