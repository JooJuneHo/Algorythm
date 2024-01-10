public class 음양_더하기 {
    public static void main(String[] args) {
        Solution26 solution26 = new Solution26();
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};
        System.out.println(solution26.solution(absolutes,signs));
    }
}

class Solution26 {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;

        int[] arr = new int[absolutes.length];

        for(int i = 0; i< absolutes.length; i++){
            if(signs[i] == true){
                arr[i] = absolutes[i];
            } else {
                arr[i] = -absolutes[i];
            }

        }

        for(int i=0; i< arr.length; i++){
            answer += arr[i];
        }




        return answer;
    }
}