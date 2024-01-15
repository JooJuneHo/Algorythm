public class 수박수박 {
    public static void main(String[] args) {
        Solution31 solution31 = new Solution31();
        System.out.println(solution31.solution(3));
    }
}

class Solution31 {
    public String solution(int n) {
        String answer = "";

        String[] subak = {"수","박"};

        for(int i=0; i<n; i++){
            answer += subak[i%2];
        }

        return answer;
    }
}
