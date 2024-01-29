public class _2016년 {
    public static void main(String[] args) {
        Solution54 solution54 =  new Solution54();

        System.out.println(solution54.solution(5,24));

    }
}

class Solution54 {
    public String solution(int a, int b) {
        String answer = "";

        final String[] week = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        final int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};


        int days=0;
        for(int i=0; i<a-1; i++){
            days += month[i];
        }
        days += b-1;
        answer = week[days % 7];



        return answer;
    }
}