package Lv_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;


public class 데이터분석 {

    public static void main(String[] args) {
        Solution13 solution13 = new Solution13();
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";
        System.out.println(Arrays.deepToString(solution13.solution(data, ext, val_ext, sort_by)));
    }
}

class Solution13 {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {

        Map<String, Integer> colOrder = new HashMap<>();
        colOrder.put("code", 0);
        colOrder.put("date", 1);
        colOrder.put("maximum", 2);
        colOrder.put("remain", 3);

        int[][] filteredData = Arrays.stream(data)
            .filter(x -> x[colOrder.get(ext)] < val_ext).toArray(int[][]::new);
        Arrays.sort(filteredData,
            Comparator.comparingInt(o -> o[colOrder.get(sort_by)]));

        return filteredData;
    }
}