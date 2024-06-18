package Lv_2;

import java.util.*;

public class 귤고르기 {
    public static void main(String[] args) {
        Solution17 solution17 = new Solution17();
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};
        System.out.println(solution17.solution(k, tangerine));
    }
}

class Solution17 {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        int sum = 0;
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < tangerine.length; i++) {
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }

        List<Integer> list = new ArrayList<>(map.values());

        Collections.sort(list, Collections.reverseOrder());

        for (int v : list) {
            if (sum + v >= k) {
                cnt++;
                break;
            } else {
                sum += v;
                cnt++;
            }
        }

        answer = cnt;
        return answer;
    }
}