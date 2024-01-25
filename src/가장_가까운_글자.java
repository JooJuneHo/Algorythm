import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 가장_가까운_글자 {
    public static void main(String[] args) {
        Solution50 solution50 = new Solution50();
        System.out.println(Arrays.toString(solution50.solution("banana")));
    }
}

class Solution50 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        Map<Character, Integer> map = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                answer[i] = -1;
                map.put(s.charAt(i),i);
            } else {
                answer[i] = i - map.get(s.charAt(i));
                map.put(s.charAt(i),i);
            }
        }

        return answer;
    }
}