package Lv_1;

import java.util.Arrays;

public class 비밀지도_1차 {

    public static void main(String[] args) {
        PracSolution2 solution2 = new PracSolution2();
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        System.out.println(Arrays.toString(solution2.solution(n, arr1, arr2)));
    }

}

class PracSolution2 {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String temp;

        for (int i = 0; i < n; i++) {
            temp = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
            temp = temp.substring(temp.length() - n);
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");
            answer[i] = temp;
        }

        return answer;
    }
}