package Lv_1;

public class 키패드누르기 {

    public static void main(String[] args) {
        Solution10 solution10 = new Solution10();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(solution10.solution(numbers, hand));
    }
}

class Solution11 {

    public String solution(int[] numbers, String hand) {
        String answer = "";
        int left = 10;
        int right = 12;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 || numbers[i] == 4 || numbers[i] == 7) {
                answer += "L";
                left = numbers[i];
            } else if (numbers[i] == 3 || numbers[i] == 6 || numbers[i] == 9) {
                answer += "R";
                right = numbers[i];
            } else {
                if (numbers[i] == 0) {
                    numbers[i] = 11;
                }
                int leftDistance =
                    Math.abs(numbers[i] - left) / 3 + Math.abs(numbers[i] - left) % 3;
                int rightDistance =
                    Math.abs(numbers[i] - right) / 3 + Math.abs(numbers[i] - right) % 3;
                if (leftDistance < rightDistance) {
                    answer += "L";
                    left = numbers[i];
                } else if (rightDistance < leftDistance) {
                    answer += "R";
                    right = numbers[i];
                } else {
                    if (hand.equals("left")) {
                        answer += "L";
                        left = numbers[i];
                    } else {
                        answer += "R";
                        right = numbers[i];
                    }
                }

            }
        }

        return answer;
    }
}