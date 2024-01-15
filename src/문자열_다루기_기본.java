public class 문자열_다루기_기본 {
    public static void main(String[] args) {
        Solution36 solution36 = new Solution36();
        System.out.println(solution36.solution("a123"));
    }
}


class Solution36 {
    public boolean solution(String s) {
        boolean answer = true;

        if(s.length() == 4 || s.length() == 6) answer = true;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) < '0' || s.charAt(i) > '9') answer = false;
        }

        return answer;
    }
}

//        if(s.length() == 4 || s.length() == 6){
//            try{
//                int x = Integer.parseInt(s);
//                answer = true;
//            } catch (NumberFormatException e){
//                answer = false;
//            }
//        } else{
//            answer = false;
//        }