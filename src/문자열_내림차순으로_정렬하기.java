import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_정렬하기 {
    public static void main(String[] args) {
        Solution34 solution34 = new Solution34();
        System.out.println(solution34.solution("Zbcdefg"));
    }
}

class Solution34 {
    public String solution(String s) {
        String answer = "";

        String[] str = s.split("");

//        Arrays.sort(str); // 오름차순
        Arrays.sort(str, Collections.reverseOrder()); // 내림차순

        for(int i=0; i<str.length; i++){
            answer+=str[i];
        }

        return answer;
    }
}