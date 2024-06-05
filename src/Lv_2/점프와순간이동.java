package Lv_2;

public class 점프와순간이동 {
    public static void main(String[] args) {
        Solution11 solution11 = new Solution11();
        System.out.println(solution11.solution(5000));
    }
}


class Solution11 {
    public int solution(int n) {
        int ans = 0;
        int warp = 0;
        int jump = 0;

        while (n >= 1) {
            if (n % 2 == 1) {
                jump++;
            }
            n /= 2;
        }
        ans = jump;

        return ans;
    }
}