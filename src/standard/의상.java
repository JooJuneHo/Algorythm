package standard;

import java.util.HashMap;
import java.util.Map;

public class 의상 {
    public static void main(String[] args) {
        SolutionSTD14 solutionSTD14 = new SolutionSTD14();
        String[][] clothes = {{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
        System.out.println(solutionSTD14.solution(clothes));
    }
}

class SolutionSTD14 {
    public int solution(String[][] clothes) {
        int answer = 1;

        Map<String, Integer> wear = new HashMap<>();

        for(int i=0; i< clothes.length; i++){
            wear.put(clothes[i][1], wear.getOrDefault(clothes[i][1],1) + 1);
        }

        for(String temp : wear.keySet()){
            int num = wear.get(temp);
            answer *= num;
        }

        return answer-1;
    }
}