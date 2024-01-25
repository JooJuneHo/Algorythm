import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers{
    public static void main(String[] args) {
        Solution solution = new Solution();
        int price = 580000;
        System.out.println(solution.solution(price));
    }
}

class Solution {
    public int solution(int price) {
        int answer = 0;


        if(price >= 500000){
            price *= 0.8;
        } else if(price >= 300000){
            price *= 0.9;
        } else if(price >= 100000){
            price *= 0.95;
        }

        return price;
    }
}