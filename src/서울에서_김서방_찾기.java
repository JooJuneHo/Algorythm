public class 서울에서_김서방_찾기 {
    public static void main(String[] args) {
        Solution24 solution24 = new Solution24();
        String[] seoul = {"Jane", "Kim"};
        System.out.println(solution24.solution(seoul));
    }
}


class Solution24 {
    public String solution(String[] seoul) {
        String answer = "";
        int location=0;

        for(String s : seoul){
            if(s.equals("Kim")){
                break;
            } else {
                location += 1;
            }
        }

        answer = "김서방은 " + location + "에 있다";


        return answer;
    }
}