import java.lang.reflect.Array;
import java.util.Arrays;

public class 제일_작은_수_제거하기 {
    public static void main(String[] args) {
        Solution29 solution29 = new Solution29();
        int[] arr = {4,3,2,1};
        System.out.println(Arrays.toString(solution29.solution(arr)));
    }
}


class Solution29 {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer={-1};
            return answer;
        }

        int[] answer = new int[arr.length - 1];

        int min = Integer.MAX_VALUE;

        for (int i : arr) {
            min = Math.min(i,min);
        }

        int answer_num=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == min){
                continue;
            } else{
                answer[answer_num++] = arr[i];
            }
        }

        return answer;
    }
}