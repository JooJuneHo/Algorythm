import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public static void main(String[] args) {
        Solution25 solution25 = new Solution25();

        int[] arr = {5,9,7,10};
        System.out.println(Arrays.toString(solution25.solution(arr, 5)));

    }

}



class Solution25 {
    public int[] solution(int[] arr, int divisor) {
        int count=0;
        int index=0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                count++;
            }
        }

        if(count == 0){
            int answer[] = {-1};
            return answer;
        }

        int[] answer = new int[count];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[index] = arr[i];
                index++;
            }
        }
        Arrays.sort(answer);


        return answer;
    }
}