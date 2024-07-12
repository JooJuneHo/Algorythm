package backjoon;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 단어공부 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().toUpperCase().split("");

        for (int i = 0; i < str.length; i++) {
            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
        }

        int max = 0;
        for (String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }

        int count = 0;
        for (String key : map.keySet()) {
            if (max == map.get(key)) {
                count++;
            }
        }
        if (count == 1) {
            for (String key : map.keySet()) {
                if (max == map.get(key)) {
                    System.out.println(key);
                }
            }
        } else {
            System.out.println("?");
        }

    }
}
