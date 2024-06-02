package Lv_2;

public class 다음큰숫자 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        System.out.println(solution7.solution(78));
    }
}

class Solution7 {
    public int solution(int n) {
        int answer = 0;

        int n_cnt = Integer.bitCount(n);
        int b_cnt = 0;

        while (true) {
            n++;
            b_cnt = Integer.bitCount(n);
            if (n_cnt == b_cnt) {
                answer = n;
                break;
            }
        }

        return answer;

    }
}