public class 두_정수_사이의_합 {
    public static void main(String[] args) {
        Solution22 solution22 = new Solution22();
        System.out.println(solution22.solution(3,5));
    }
}

class Solution22{
    public long solution(int a, int b){
        long answer = 0;

        if(a>b){
            for(int i=b; i<=a; i++){
                answer+=i;
            }
        } else if(a<b) {
            for(int i=a; i<=b; i++){
                answer+=i;
            }
        } else if(a==b) {
            answer = a;
        }


        return answer;
    }
}
