package Lv_1;

public class 다트_게임 {

    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        System.out.println(solution8.solution("1S2D*3T"));
    }
}

class Solution8 {

    public int solution(String dartResult) {
        int answer = 0;
        String[] dart = dartResult.split("");
        int[] score = new int[3];

        int index = -1;
        for (int i = 0; i < dartResult.length(); i++) {
            if (dart[i].matches("[0-9]")) {
                index++;
                score[index] = Integer.parseInt(dart[i]);
                if (dart[i + 1].matches("[0-9]")) {
                    score[index] *= 10;
                    i++;
                }
            }
            switch (dart[i]) {
                case "D":
                    score[index] = (int) Math.pow(score[index], 2);
                    break;
                case "T":
                    score[index] = (int) Math.pow(score[index], 3);
                    break;
                case "*":
                    score[index] *= 2;
                    if (index - 1 >= 0) {
                        score[index - 1] *= 2;
                    }
                    break;
                case "#":
                    score[index] *= -1;
            }

        }

        for (int s : score) {
            answer += s;
        }

        return answer;
    }
}