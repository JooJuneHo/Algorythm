import java.util.ArrayList;
import java.util.List;

public class 기사단원의_무기 {

    public static void main(String[] args) {
        Solution60 solution60 = new Solution60();
        System.out.println(solution60.solution(10,3,2));
    }
}
class Solution60 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        //for문을 i부터 number까지 반복
        //i의 약수의 개수와 limit을 비교
        //그리고 그에 따라 answer 덧셈
        for (int i = 1; i <= number; i++) {
            if (divisorCount(i) <= limit)
                answer += divisorCount(i);
            else
                answer += power;
        }

        return answer;
    }

    public int divisorCount(int num) {
        int cnt = 0;

        //num이 16일 경우 약수는 1, 2, 4, 8, 16
        //합성수의 특징에 따라
        //16의 제곱근인 4 전까지는 약수의 개수가 하나 더 있음이 보장
        //따라서 for문은 i가 제곱근일때 까지 반복
        for (int i = 1; i * i <= num; i++) {
            //i가 num이 제곱근일 경우 cnt++
            if (i * i == num)
                cnt++;
                //i가 제곱근이 아닌 약수일 경우 cnt += 2
            else if (num % i == 0)
                cnt += 2;
        }

        return cnt;
    }
}