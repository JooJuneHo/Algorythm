package Lv_0;


import java.util.ArrayList;
import java.util.List;

public class practice {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("AAAAE"));
    }
}


class Solution {
    static String[] words = {"A", "E", "I", "O", "U"};
    static List<String> list;

    public int solution(String word) {
        int answer = 0;
        list = new ArrayList<>();

        dfs("", 0);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    static void dfs(String str, int len) {
        list.add(str);
        if (len == 5) return;
        for (int i = 0; i < 5; i++) {
            dfs(str + words[i], len + 1);
        }
    }
}