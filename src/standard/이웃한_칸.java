package standard;

public class 이웃한_칸 {

    public static void main(String[] args) {
        SolutionSTD3 solutionSTD3 = new SolutionSTD3();

//
//        System.out.println(solutionSTD3.solution());
    }

}
//https://school.programmers.co.kr/learn/courses/30/lessons/250125

class SolutionSTD3 {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;
        int n = board.length;
        int count = 0;

        int[] dh = {0,-1,1,0};
        int[] dw = {1,0,0,-1};

        for(int i=0; i<4; i++){
            int h_check = h+dh[i];
            int w_check = w+dw[i];
            if((h_check>=0 && h_check<n) && (w_check>=0 && w_check<n)){
                if(board[h][w]==(board[h_check][w_check])){
                    count++;
                }
            }
        }
        answer = count;

        return answer;
    }
}