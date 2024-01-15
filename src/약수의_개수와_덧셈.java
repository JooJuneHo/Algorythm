public class 약수의_개수와_덧셈 {
    public static void main(String[] args) {
        Solution33 solution33 = new Solution33();
        System.out.println(solution33.solution(13,17));
    }
}

class Solution33 {
    public int solution(int left, int right) {
        int answer = 0;

        for(int i=left; i<=right; i++){
            int yaksu = 0;
            for(int j=1; j<=i; j++){
                if(i%j==0){
                    yaksu++;
                }
            }
            if(yaksu%2 == 0){
                answer += i;
            }else{
                answer -= i;
            }
        }


        return answer;
    }
}