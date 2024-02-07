import java.util.ArrayList;
import java.util.List;

public class 소수_만들기 {
    public static void main(String[] args) {
        Solution58 solution58 = new Solution58();
        int[] nums = {1, 2, 3, 4};
        System.out.println(solution58.solution(nums));
    }
}



class Solution58 {
    public int solution(int[] nums) {
        int answer = 0;
        boolean chk = false;

        List<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    int num = nums[i] + nums[j] + nums[k];
                    if(num >= 2)
                        chk = sosu(num);
                    if(chk == true)
                        answer++;
                }
            }
        }

        return answer;
    }

    private boolean sosu(int num) {
        boolean check = true;
        if(num==2) { //소수일때
            return check;

        }
        for(int i=2; i<num; i++) { //소수가 아닐때
            if(num%i ==0) {
                check = false;
                break;
            }
        }
        return check;
    }
}