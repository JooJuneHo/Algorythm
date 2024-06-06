package Lv_2;

import java.util.Arrays;

public class 구명보트 {
    public static void main(String[] args) {
        Solution12 solution12 = new Solution12();
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println(solution12.solution(people, limit));
    }
}

class Solution12 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int index = 0;

        for (int i = people.length - 1; i >= index; i--) {
            if (people[i] + people[index] <= limit) {
                index++;
                answer++;
            } else {
                answer++;
            }
        }

        return answer;
    }
}