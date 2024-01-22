public class 최소직사각형 {
    public static void main(String[] args) {
        Solution44 solution44 = new Solution44();
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        System.out.println(solution44.solution(sizes));
    }
}

class Solution44 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxLength=0;
        int maxHeight=0;
        for(int i=0; i< sizes.length; i++){
            int v = Math.max(sizes[i][0], sizes[i][1]);
            int h = Math.min(sizes[i][0], sizes[i][1]);
            maxLength = Math.max(maxLength, v); //80
            maxHeight = Math.max(maxHeight, h); //50
        }


        return answer = maxLength*maxHeight;
    }
}