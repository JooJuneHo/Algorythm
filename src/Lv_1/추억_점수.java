package Lv_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 추억_점수 {

    public static void main(String[] args) {
        PracSolution3 solution3 = new PracSolution3();
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"},
            {"kon", "kain", "may", "coni"}};
        System.out.println(Arrays.toString(solution3.solution(name, yearning, photo)));
    }
}

class PracSolution3 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            for (int j = 0; j < photo[i].length; j++) {
                if (map.get(photo[i][j]) != null) {
                    answer[i] += map.get(photo[i][j]);
                }
            }
        }

        return answer;
    }
}