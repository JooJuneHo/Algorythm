package standard;

import java.util.Arrays;

public class 바탕화면_정리 {

    public static void main(String[] args) {
        SolutionSTD8 solutionSTD8 = new SolutionSTD8();
        System.out.println(
            Arrays.toString(solutionSTD8.solution(new String[]{"..........", ".....#....", "......##..", "...##.....", "....#....."})));
    }
}

class SolutionSTD8 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int top = Integer.MAX_VALUE;
        int left = Integer.MAX_VALUE;
        int bottom = Integer.MIN_VALUE;
        int right = Integer.MIN_VALUE;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++){
                if(wallpaper[i].charAt(j) == '#'){
                    top = Math.min(i,top);
                    left = Math.min(j, left);
                    bottom = Math.max(i + 1, bottom);
                    right = Math.max(j + 1, right);
                }

            }
        }

        answer[0] = top;
        answer[1] = left;
        answer[2] = bottom;
        answer[3] = right;

        return answer;
    }
}