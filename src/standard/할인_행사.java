package standard;

import java.util.HashMap;
import java.util.Map;

public class 할인_행사 {

    public static void main(String[] args) {
        SolutionSTD11 solutioSTD11 = new SolutionSTD11();
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        System.out.println(solutioSTD11.solution(want,number,discount));
    }
}

class SolutionSTD11 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();

        for(int i = 0; i < want.length; i++){
            map.put(want[i], number[i]);
        }

        for(int i = 0; i < discount.length - 9; i++){
            Map<String, Integer> dMap = new HashMap<>();

            for(int j = i; j < i+10; j++){
                dMap.put(discount[j], dMap.getOrDefault(discount[j], 0) + 1);
            }

            Boolean isIdentical = true;

            for(String key : map.keySet()){
                if(map.get(key) != dMap.get(key)){
                    isIdentical = false;
                    break;
                }
            }

            answer += isIdentical ? 1 : 0;
        }

        return answer;
    }
}