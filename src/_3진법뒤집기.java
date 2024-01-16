import java.util.ArrayList;
import java.util.List;

public class _3진법뒤집기 {
    public static void main(String[] args) {
        Solution40 solution40 = new Solution40();
        System.out.println(solution40.solution(45));
    }
}

class Solution40 {
    public int solution(int n) {
        int answer = 0;
        String a = "";

        while(n > 0){
            a = (n % 3) + a;//a+(n%3)
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();

        answer = Integer.parseInt(a,3);
        return answer;
    }
}