package standard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class 달리기_경주 {

    public static void main(String[] args) {
        SolutionSTD9 solutionSTD9 = new SolutionSTD9();
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};

        System.out.println(Arrays.toString(solutionSTD9.solution(players, callings)));
    }
}

class SolutionSTD9 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int grade = map.get(calling);
            String forwardCalling = players[grade - 1];
            players[grade - 1] = calling;
            map.put(calling, grade - 1);
            players[grade] = forwardCalling;
            map.put(forwardCalling, grade);
        }

        return players;
    }
}