public class 삼총사 {
    public static void main(String[] args) {
        Solution42 solution42 = new Solution42();
        int[] arr = {1,2,3,4};

        System.out.println(solution42.solution(arr));
    }
}

class Solution42 {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length; i++) {
            for(int j = i + 1; j < number.length; j++) {
                for(int k = j + 1; k < number.length; k++) {
                    if(number[i] + number[j] + number[k] == 0) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}
