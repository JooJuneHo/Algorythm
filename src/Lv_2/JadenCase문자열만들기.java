package Lv_2;

public class JadenCase문자열만들기 {

    public static void main(String[] args) {
        Solution4 solution4 = new Solution4();
        System.out.println(solution4.solution("3people unFollowed me"));
    }
}

class Solution4 {

    public String solution(String s) {
        String answer = "";

        s = s.toLowerCase();
        boolean check = true;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                check = true;
            } else if (check) {
                c = Character.toUpperCase(c);
                check = false;
            }
            answer += c;
        }

        return answer;
    }
}