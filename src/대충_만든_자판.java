import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 대충_만든_자판 {

    public static void main(String[] args) {
        SolutionSTD2 solutionSTD2 = new SolutionSTD2();
        String[] keymap = {"ABACD", "BCEFD"};
        String[] targets = {"ABCD","AABB"};
        System.out.println(Arrays.toString(solutionSTD2.solution(keymap, targets)));
    }
}

//https://school.programmers.co.kr/learn/courses/30/lessons/160586

class SolutionSTD2 {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character,Integer> keypad = new HashMap<>();

        for(int i=0; i<keymap.length; i++){
            for(int j=0; j<keymap[i].length(); j++){
                char cur = keymap[i].charAt(j);
                if(keypad.containsKey(cur)){
                    int idx = keypad.get(cur);
                    keypad.put(cur, Math.min(idx, j+1));
                }
                else{
                    keypad.put(cur,j+1);
                }
            }
        }

        for(int i=0; i<targets.length; i++){
            String target = targets[i];
            int count=0;
            boolean flag =true;
            for(char cur : target.toCharArray()){
                if(keypad.containsKey(cur)){
                    count += keypad.get(cur);
                }
                else{
                    flag = false;
                    break;
                }
            }
            answer[i] = flag == false ? -1 : count;
        }


        return answer;
    }
}