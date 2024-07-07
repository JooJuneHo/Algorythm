package Lv_2;

public class 피로도 {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        System.out.println(solution24.solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }
}


class Solution24 {
    int answer;
    boolean[] visited;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];

        dfs(0, k, dungeons);

        return answer;
    }

    private void dfs(int depth, int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                dfs(depth + 1, k - dungeons[i][1], dungeons);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, depth);
    }

}