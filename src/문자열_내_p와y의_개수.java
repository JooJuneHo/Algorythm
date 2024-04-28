public class 문자열_내_p와y의_개수 {

    public static void main(String[] args) {
        PracSolution1 solution = new PracSolution1();
        String s = "Pyy";
        System.out.println(solution.solution(s));
    }
}

class PracSolution1 {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == 'p' || c == 'P'){
                p++;
            }
            if(c == 'y' || c == 'Y'){
                y++;
            }
        }

        if(p==y){
            answer = true;
        }else{
            answer = false;
        }

        return answer;
    }
}
