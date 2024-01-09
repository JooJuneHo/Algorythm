import java.util.Arrays;

public class A17 {
    public static void main(String[] args) {
        Solution17 solution = new Solution17();
        System.out.println(Arrays.toString(solution.solution(12345)));
    }
}


class Solution17 {
    public int[] solution(long n) {
        String s = String.valueOf(n);

        int []answer = new int[s.length()];

        for(int i=0; i<answer.length; i++){
            answer[i] = Integer.parseInt(s.substring(answer.length-i-1,answer.length-i));
        }

        return answer;
    }
}