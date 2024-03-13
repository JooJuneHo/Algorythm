package standard;

import java.util.Stack;

public class 크레인_인형뽑_게임 {

    public static void main(String[] args) {
        SolutionSTD7 solutionSTD7 = new SolutionSTD7();
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solutionSTD7.solution(board,moves));
    }
}

class SolutionSTD7 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> bascket = new Stack<>();

        for(int i=0; i<moves.length; i++){
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    if(!bascket.isEmpty() && bascket.peek() == board[j][moves[i]-1]){
                        answer++;
                        answer++;
                        board[j][moves[i]-1] = 0;
                        bascket.pop();
                        break;
                    } else{
                        bascket.push(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}


