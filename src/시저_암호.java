public class 시저_암호 {
    public static void main(String[] args) {
        Solution45 solution45 = new Solution45();
        System.out.println(solution45.solution("a B z",4));
    }
}


class Solution45 {
    public String solution(String s, int n) {
        String answer = "";
        for(char ch : s.toCharArray()) {
            if(ch==' ') {
                answer += ch;
            }else if(ch>='a'&& ch<='z'){
                answer += (char)('a' + (ch-'a'+n)%26);
            }else {
                answer += (char)('A' + (ch-'A'+n)%26);
            }
        }
        return answer;
    }
}