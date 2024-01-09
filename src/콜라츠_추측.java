public class 콜라츠_추측 {
    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        System.out.println(solution23.solution(6));
    }
}

class Solution23 {
    public int solution(int num) {
        int answer = 0;

        while(num!=1){
            if(num%2 == 0){
                num /= 2;
            } else if(num%2 == 1){
                num = num*3 + 1;
            }
            answer++;

            if(answer == 500){
                answer = -1;
                break;
            }
        }


        return answer;
    }
}