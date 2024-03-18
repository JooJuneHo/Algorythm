package standard;

import java.util.Arrays;
import java.util.Objects;

public class 로또의_최고_순위와_최저_순위 {

    public static void main(String[] args) {
        SolutionSTD10 solutionSTD10 = new SolutionSTD10();
        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_nums = {31, 10, 45, 1, 6, 19};

        System.out.println(Arrays.toString(solutionSTD10.solution(lottos, win_nums)));
    }
}

class SolutionSTD10 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int max = 0;
        int min = 0;

        for(Integer lotto : lottos){
            for(Integer num : win_nums){
                if(Objects.equals(lotto, num)){
                    min++;
                }
            }
        }

        for(Integer lotto : lottos){
            if(lotto == 0){
                max++;
            }
            for(Integer num : win_nums){
                if(Objects.equals(lotto, num)){
                    max++;
                }
            }
        }

        switch (max){
            case 6 :
                answer[0] = 1;
                break;
            case 5 :
                answer[0] = 2;
                break;
            case 4 :
                answer[0] = 3;
                break;
            case 3 :
                answer[0] = 4;
                break;
            case 2 :
                answer[0] = 5;
                break;
            case 1 :
            case 0 :
                answer[0] = 6;
                break;
        }

        switch (min){
            case 6 :
                answer[1] = 1;
                break;
            case 5 :
                answer[1] = 2;
                break;
            case 4 :
                answer[1] = 3;
                break;
            case 3 :
                answer[1] = 4;
                break;
            case 2 :
                answer[1] = 5;
                break;
            case 1 :
            case 0 :
                answer[1] = 6;
                break;
        }



        return answer;
    }
}