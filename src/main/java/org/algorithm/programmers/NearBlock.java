package org.algorithm.programmers;

/**
 * 프로그래머스 이웃한 블럭
 */
public class NearBlock {
    public int solution(String[][] board, int h, int w) {
        String color = board[h][w];
        int count = 0;

        if(h-1 > 0 && color.equals(board[h-1][w])) count++;
        if(h+1 > board.length && color.equals(board[h+1][w])) count++;
        if(w-1 > 0 && color.equals(board[h][w-1])) count++;
        if(w+1 > board.length && color.equals(board[h][w+1])) count++;

        return count;
    }

}
