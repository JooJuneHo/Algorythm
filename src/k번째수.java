import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class k번째수 {
    public static void main(String[] args) {
        Solution48 solution48 = new Solution48();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution48.solution(array, commands)));
    }
}

class Solution48 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        List<Integer> arr = new ArrayList<>();

        for(int i=0; i < commands.length; i++){
            for(int j=commands[i][0]; j<=commands[i][1]; j++){
                arr.add(array[j-1]);
            }
            Collections.sort(arr);

            answer[i] = arr.get(commands[i][2]-1);
            arr.clear();
        }



        return answer;
    }
}