public class A19 {
    public static void main(String[] args) {
        Solution19 solution = new Solution19();
        System.out.println(solution.solution(121));
    }
}

class Solution19 {
    public long solution(long n) {
        long answer = 0;
        if(Math.pow((int)Math.sqrt(n),2) == n){
            answer = (long)Math.pow((int)Math.sqrt(n)+1, 2);
        } else{
            answer = -1;
        }
        return answer;
    }
}