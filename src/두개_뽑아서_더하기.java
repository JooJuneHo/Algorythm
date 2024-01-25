import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개_뽑아서_더하기 {
    public static void main(String[] args) {
        Solution49 solution49 = new Solution49();
        int[] numbers= {2,1,3,4,1};
        System.out.println(Arrays.toString(solution49.solution(numbers)));
    }

}

class Solution49 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> set = new HashSet<>();

        for(int i=0; i < numbers.length; i++){
            for(int j=i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }

        answer = set.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        Arrays.sort(answer);

        return answer;
    }
}