package Lv_2;

public class n진수게임 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        System.out.println(solution29.solution(2, 4, 2, 1));
    }
}

class Solution29 {
    public String solution(int n, int t, int m, int p) {
        String answer = "";

        int num = 0;

        String str = "";

        for (int i = 0; i < t * m; i++) {
            String temp = Integer.toString(num, n).toUpperCase();
            str += temp;
            num++;
        }

        String list = str.substring(0, t * m);

        for (int i = p - 1; i < list.length(); i += m) {
            char c = list.charAt(i);
            answer += c;
        }
        return answer;
    }
}