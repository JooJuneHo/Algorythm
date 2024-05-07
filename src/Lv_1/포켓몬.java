package Lv_1;

import java.util.HashSet;

public class 포켓몬 {

    public static void main(String[] args) {
        PracSolution4 solution4 = new PracSolution4();
        int[] nums = {3, 1, 2, 3};
        System.out.println(solution4.solution(nums));
    }
}

class PracSolution4 {

    public int solution(int[] nums) {
        int max = nums.length / 2;

        HashSet<Integer> hashSet = new HashSet<>();

        for (int n : nums) {
            hashSet.add(n); //중복 제거
        }

        if (max >= hashSet.size()) {
            return hashSet.size();
        } else {
            return max;
        }
    }
}