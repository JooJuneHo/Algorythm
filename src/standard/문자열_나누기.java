package standard;

public class 문자열_나누기 {

    public static void main(String[] args) {
        SolutionSTD5 solutionSTD5 = new SolutionSTD5();
        System.out.println(solutionSTD5.solution("banana"));
    }
}


class SolutionSTD5 {
    public int solution(String s) {
        int answer = 0;

        char first = s.charAt(0);
        int firstNum = 0;
        int diff = 0;
        for (int i = 0; i < s.length(); i++) {
            if (firstNum == diff) {
                answer++;
                first = s.charAt(i);
            }
            if (s.charAt(i) == first) firstNum++;
            else diff++;
        }
        return answer;
    }
}