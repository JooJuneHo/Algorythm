import java.util.Arrays;
import java.util.Stack;

public class 같은_숫자는_싫어 {

    public static void main(String[] args) {
        PracSolution2 solution = new PracSolution2();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution.solution(arr)));
    }
}

class PracSolution2 {

    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                stack.push(arr[i]);
            } else if (!stack.peek().equals(arr[i])) {
                stack.push(arr[i]);
            }
        }
        int[] answer = new int[stack.size()];

        for (int i = stack.size() - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}