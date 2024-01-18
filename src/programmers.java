import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3};
        System.out.println(solution.solution(arr));
    }
}

class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        int max=0;

        for(int i=0; i<sides.length; i++){
            if(sides[i] > max){
                max = sides[i];
            }
        }


            return answer;
    }
}