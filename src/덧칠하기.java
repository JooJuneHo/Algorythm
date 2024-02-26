import java.util.Arrays;

public class 덧칠하기 {

    public static void main(String[] args) {
        Solution59 solution59 = new Solution59();
        int[] section = {2,3,6};
        System.out.println(solution59.solution(8,4,new int[]{2,3,6}));

    }

}

class Solution59 {
    public int solution(int n, int m, int[] section) {
        int roller = section[0];
        int cnt = 1;
        for(int i = 1; i < section.length; i++) {
            if(roller + m - 1 < section[i]) {
                cnt++;
                roller = section[i];
            }
        }
        return cnt;
    }
}