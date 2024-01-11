public class 핸드폰_번호_가리기 {
    public static void main(String[] args) {
        Solution27 solution27 = new Solution27();
        System.out.println(solution27.solution("01099460062"));
    }
}

class Solution27 {
    public String solution(String phone_number) {
        String answer = "";

        String[] num = phone_number.split("");

        int len = num.length;

        for(int i=0; i<len; i++){
            if(i < len - 4){
                answer += "*";
            } else{
                answer += num[i];
            }
        }



            return answer;
    }
}