package Lv_2;

import java.util.Arrays;

public class 카펫 {
    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        System.out.println(Arrays.toString(solution10.solution(10, 2)));
    }
}

class Solution10 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        int carpet = brown + yellow;

        // yellow가 존재하기 위해서는 가로와 세로의 길이가 3이상이여야 한다.
        for (int i = 3; i <= carpet; i++) {
            int col = i; // 세로
            int row = carpet / col; // 가로

            // 가로의 갯수가 3 이하라면 다음 인덱스
            if (row < 3) {
                continue;
            }

            // "가로는 세로의 길이보다 크거나 같다" 조건
            if (row >= col) {
                if ((row - 2) * (col - 2) == yellow) {
                    answer[0] = row;
                    answer[1] = col;
                    break;
                }
            }
        }
        return answer;
    }
}