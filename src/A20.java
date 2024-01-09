import java.util.*;

public class A20 {
    public static void main(String[] args) {
        Solution20 solution = new Solution20();
        System.out.println(solution.solution(118372));

    }
}

class Solution20 {
    public long solution(long n) {
        long answer = 0;

        String[] list = String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());

        String str = "";

        for(String aList : list){
            str += aList;
        }

        answer = Long.parseLong(str);

        return answer;
    }
}