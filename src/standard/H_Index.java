package standard;

import java.util.Arrays;

public class H_Index {

    public static void main(String[] args) {
        SolutionSTD13 solutionSTD13 = new SolutionSTD13();
        System.out.println(solutionSTD13.solution(new int[]{3, 0, 6, 1, 5}));
    }
}

class SolutionSTD13 {
    public int solution(int[] citations) {
        int answer = 0;

//        for(int i=0; i< citations.length; i++){
//            int h = citations[i];
//            int count=0;
//            for(int num:citations){
//                if(num>=h){
//                    count++;
//                }
//            }
//            if(count>=h){
//                answer = Math.max(answer,h);
//            }
//        }

        Arrays.sort(citations);

        for(int i=0; i<citations.length; i++){
            int h = citations.length - i;

            if(citations[i] >= h){
                answer=h;
                break;
            }
        }

        return answer;
    }
}