import java.util.ArrayList;
import java.util.List;

public class 이상한_문자_만들기 {
    public static void main(String[] args) {
        String s = "try hello world";
        Solution41 solution41 = new Solution41();
        System.out.println(solution41.solution(s));
    }
}
class Solution41 {
    public String solution(String s) {
        String answer = "";

        List<String> str = new ArrayList<>();

        int idx =0;
        for(int i=0; i<s.length(); i++){
            str.add(String.valueOf(s.charAt(i)));
        }

        for(int i=0; i<str.size(); i++){
            if(str.get(i).equals(" ")){
                idx=0;
            } else if(idx%2 == 0){
                str.set(i, str.get(i).toUpperCase());
                idx++;
            } else {
                str.set(i, str.get(i).toLowerCase());
                idx++;
            }
            answer+=str.get(i);
        }

        return answer;
    }
}
