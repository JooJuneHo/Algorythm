package Lv_2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 롤케이크자르기 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        System.out.println(solution31.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));
    }
}


class Solution31 {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> a = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        for (int t : topping) {
            if (a.containsKey(t)) {
                a.put(t, a.get(t) + 1);
            } else {
                a.put(t, 1);
            }
        }

        for (int t : topping) {
            a.put(t, a.get(t) - 1);
            set.add(t);
            if (a.get(t) == 0) {
                a.remove(t);
            }
            if (a.size() == set.size()) {
                answer++;
            }
        }
        return answer;
    }
}