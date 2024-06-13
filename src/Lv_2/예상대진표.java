package Lv_2;

public class 예상대진표 {
    public static void main(String[] args) {
        Solution14 solution14 = new Solution14();
        System.out.println(solution14.solution(8, 4, 7));
    }
}

class Solution14 {
    public int solution(int n, int a, int b) {
        int answer = 0;

        while (true) {
            a = a / 2 + a % 2;
            b = b / 2 + b % 2;

            answer++;
            
            if (a == b) break;
        }

        return answer;
    }
}