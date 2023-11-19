package inflearn.stackandqueue;

import java.io.*;
import java.util.Stack;

public class Question03 {

    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i = 0; i < moves.length; i++) {
            int p = moves[i] - 1;
            for (int j = 0; j < board.length; j++) {
                if(board[j][p] != 0) {
                    stack.push(board[j][p]);
                    board[j][p] = 0;
                    break;
                }
            }

            if(stack.size() >= 2) {
                Integer pop = stack.pop();
                if(pop == stack.peek()) {
                    stack.pop();
                    answer +=2;
                }
                else {
                    stack.push(pop);
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        int[][] arr = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] move = {1,5,3,5,1,2,1,4};

        int solution = new Question03().solution(arr, move);
        System.out.println("solution = " + solution);
    }
}
