public class 푸드_파이트_대회 {
    public static void main(String[] args) {
        Solution51 solution51 = new Solution51();
        int[] food = {1,3,4,6};
        System.out.println(solution51.solution(food));
    }

}


class Solution51 {
    public String solution(int[] food) {
        String answer = "";

        StringBuilder sb = new StringBuilder();

        for(int i=1; i<food.length; i++){
            sb.append(String.valueOf(i).repeat(food[i]/2));
        }

        answer = sb.toString() + "0" + sb.reverse().toString();


        return answer;
    }
}