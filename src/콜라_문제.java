public class 콜라_문제 {
    public static void main(String[] args) {
        Solution52 solution52 = new Solution52();
        System.out.println(solution52.solution(2,1,20));
    }
}

class Solution52 {
    public int solution(int a, int b, int n) {
        int answer = 0;

        int cola=0;

        while(n/a>=1){
            answer += n/a*b;
            n = (n/a*b) + n%a;
        }


        return answer;
    }
}