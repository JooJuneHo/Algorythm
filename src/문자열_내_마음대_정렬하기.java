import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 문자열_내_마음대_정렬하기 {
    public static void main(String[] args) {
        Solution47 solution47 = new Solution47();
        String[] strings = {"sun", "bed", "car"};
        System.out.println(Arrays.toString(solution47.solution(strings, 1)));
    }
}


class Solution47 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        List<String> arr = new ArrayList<>();


        for(int i=0; i< strings.length; i++){
            arr.add(""+ strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);

        answer = new String[arr.size()];
        for(int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i).substring(1,arr.get(i).length());
        }


        return answer;
    }
}