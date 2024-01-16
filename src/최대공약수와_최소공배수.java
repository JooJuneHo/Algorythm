import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class 최대공약수와_최소공배수 {
    public static void main(String[] args) {
        Solution39 solution39 = new Solution39();
        System.out.println(Arrays.toString(solution39.solution(3, 12)));
    }

}

class Solution39 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n,m);
        int min = Math.min(n,m);

        while(min != 0){
            int r = max % min;
            max = min;
            min = r;
        }

        int gcd = n*m/max;

        answer[0] = max;
        answer[1] = gcd;

        return answer;
    }
}