package Lv_2;

import java.util.LinkedList;
import java.util.Queue;

public class 캐시 {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        System.out.println(solution21.solution(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"}));
    }
}

class Solution21 {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;

        Queue<String> cache = new LinkedList<>();


        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toUpperCase();

            if (cache.contains(city)) {
                cache.remove(city);
                cache.add(city);
                answer += 1;
            } else {
                if (cache.size() == cacheSize) {
                    cache.remove();
                }
                cache.add(city);
                answer += 5;
            }
        }

        return answer;
    }
}