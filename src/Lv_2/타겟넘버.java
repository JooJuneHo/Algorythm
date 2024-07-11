package Lv_2;

public class 타겟넘버 {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        System.out.println(solution28.solution(new int[]{1, 1, 1, 1, 1}, 3));
    }
}

class Solution28 {
    int answer = 0;

    public int solution(int[] numbers, int target) {

        dfs(numbers, 0, target, 0);

        return answer;
    }

    public void dfs(int[] numbers, int depth, int target, int sum) {
        if (depth == numbers.length) { // 마지막 노드 까지 탐색한 경우
            if (target == sum) answer++;
        } else {
            dfs(numbers, depth + 1, target, sum + numbers[depth]); // 해당 노드의 값을 더하고 다음 깊이 탐색
            dfs(numbers, depth + 1, target, sum - numbers[depth]); // 해당 노드의 값을 빼고 다음 깊이 탐색
        }
    }
}