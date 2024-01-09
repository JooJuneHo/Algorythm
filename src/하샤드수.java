public class 하샤드수 {
    public static void main(String[] args) {
        Solution21 solution21 = new Solution21();
        System.out.println(solution21.solution(10));
    }
}

class Solution21 {
    public boolean solution(int x) {
        boolean answer = true;

        int sum=0;
        int num = x;

        while (num > 0) {
            sum +=  num%10;
            num /= 10;
        }
        if(x % sum == 0){
            answer = true;
        }else{
            answer = false;
        }


        return answer;
    }
}