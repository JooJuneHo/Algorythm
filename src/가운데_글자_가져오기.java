public class 가운데_글자_가져오기 {
    public static void main(String[] args) {
        Solution30  solution30 = new Solution30();
        System.out.println(solution30.solution("qwer"));
    }
}


class Solution30 {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");
        if(s.length() % 2 == 1){
            answer += str[s.length()/2];
        } else {
            answer += str[s.length()/2-1] + str[s.length()/2];
        }


        return answer;
    }
}