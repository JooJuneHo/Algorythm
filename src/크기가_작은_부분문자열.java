public class 크기가_작은_부분문자열 {
    public static void main(String[] args) {
        Solution43 solution43 = new Solution43();
        System.out.println(solution43.solution("500220839878","7"));
    }
}


class Solution43 {
    public int solution(String t, String p) {
        int answer = 0;

        for(int i=0; i<t.length()-p.length()+1; i++){
            String str = t.substring(i,i+p.length());
            if(Long.parseLong(str) <= Long.parseLong(p)){
                answer++;
            }
        }

        return answer;
    }
}