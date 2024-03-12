package standard;

public class 둘만의_암호 {

    public static void main(String[] args) {
        SolutionSTD6 solutionSTD6 = new SolutionSTD6();

        System.out.println(solutionSTD6.solution("aukks","wbqd",5));
    }
}

class SolutionSTD6 {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int count = 1;
            while(count <= index){
                ++c;
                if(c > 'z')
                    c -= 26;
                if(!skip.contains(c+"")){
                    count++;
                }
            }
            answer += c;
        }
        return answer;
    }
}