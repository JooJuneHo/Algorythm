package Lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

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
        String[] dataArr = {"code", "date", "maximum", "remain"};

        int sortByNum = 0;
        int extNum = 0;
        for (int i = 0; i < dataArr.length; i++) {
            if (dataArr[i].equals(ext)) {
                extNum = i;
            }
            if (dataArr[i].equals(sort_by)) {
                sortByNum = i;
            }
        }

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < data.length; i++) {
            if (ext.equals("code")) {
                if (data[i][extNum] < val_ext) {
                    list.add(data[i]);
                }
            } else if (ext.equals("date")) {
                if (data[i][extNum] < val_ext) {
                    list.add(data[i]);
                }
            } else if (ext.equals("maximum")) {
                if (data[i][extNum] < val_ext) {
                    list.add(data[i]);
                }
            } else if (ext.equals("remain")) {
                if (data[i][extNum] < val_ext) {
                    list.add(data[i]);
                }
            }
        }

        final int si = sortByNum;
        list.sort(Comparator.comparingInt(o -> o[si]));

        int[][] answer = new int[list.size()][4];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}