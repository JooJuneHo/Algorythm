package Lv_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 뉴스클러스터링 {
    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();
        System.out.println(solution25.solution("FRANCE1", "french"));
    }
}

class Solution25 {
    public int solution(String str1, String str2) {

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for (int i = 0; i < str1.length() - 1; i++) {
            char a = str1.charAt(i);
            char b = str1.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                String str = String.valueOf(a) + String.valueOf(b);
                list1.add(str);
            }
        }

        for (int i = 0; i < str2.length() - 1; i++) {
            char a = str2.charAt(i);
            char b = str2.charAt(i + 1);

            if (Character.isLetter(a) && Character.isLetter(b)) {
                String str = String.valueOf(a) + String.valueOf(b);
                list2.add(str);
            }
        }

        Collections.sort(list1);
        Collections.sort(list2);

        for (String s : list1) {
            if (list2.remove(s)) {
                intersection.add(s);
            }
            union.add(s);
        }

        for (String s : list2) { // 교집합에서 제외된 것 뺀 나머지 합집합에 추가
            union.add(s);
        }

        // 자카드 유사도 구하기
        double a = intersection.size();
        double b = union.size();

        double jakard = 0;

        if (union.size() == 0)
            jakard = 1;    // 공집합일 경우 1
        else
            jakard = (double) intersection.size() / (double) union.size();

        return (int) (jakard * 65536);
    }
}