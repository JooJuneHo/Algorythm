public class 없는_숫자_더하기 {
    public static void main(String[] args) {
        Solution28 solution28 = new Solution28();
        int[] numbers = {1,2,3,5,6,7,8,0};
        System.out.println(solution28.solution(numbers));
    }
}

class Solution28 {
    public int solution(int[] numbers) {
        int answer = 0;

        boolean[] check = new boolean[10];
        for(int i=0; i< check.length; i++){
            check[i] = false;
        }

        for(int i=0; i< numbers.length; i++){
            if(!check[numbers[i]]){
                check[numbers[i]] = true;
            }
        }

        for(int i=0; i<check.length; i++){
            if(!check[i]){
                answer += i;
            }
        }

        return answer;
    }
}