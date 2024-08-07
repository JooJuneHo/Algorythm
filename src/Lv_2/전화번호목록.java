package Lv_2;

import java.util.HashMap;
import java.util.Map;

public class 전화번호목록 {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        System.out.println(solution26.solution(new String[]{"123", "456", "789"}));
    }
}


class Solution26 {
    public boolean solution(String[] phone_book) {
        // 1. HashMap을 선언한다.
        Map<String, Integer> map = new HashMap<>();

        // 2. 모든 전화번호를 HashMap에 넣는다.
        for (int i = 0; i < phone_book.length; i++)
            map.put(phone_book[i], i);

        // 3. 모든 전화번호의 substring이 HashMap에 존재하는지 확인한다.
        for (int i = 0; i < phone_book.length; i++)
            for (int j = 0; j < phone_book[i].length(); j++)
                if (map.containsKey(phone_book[i].substring(0, j)))
                    return false;

        return true;
    }
}