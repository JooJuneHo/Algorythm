package Lv_2;

import java.util.HashSet;
import java.util.Set;

public class 연속부수열합의개수 {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int[] elements = {7, 9, 1, 1, 4};
        System.out.println(solution18.solution(elements));
    }
}

class Solution18 {
    public int solution(int[] elements) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= elements.length; i++) {
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                for (int k = j; k < j + i; k++) {
                    sum += elements[k % elements.length];
                }
                set.add(sum);
            }
        }
        answer = set.size();

        return answer;
    }
}