package org.algorithm.programmers;

import java.util.Arrays;

/*
    [프로그래머스] K번수
 */
public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int index = 0;
        int[] answer = new int[commands.length];

        for(int[] command : commands) {
            int[] cutArray = Arrays.copyOfRange(array,command[0]-1, command[1]);
            Arrays.sort(cutArray);
            answer[index] = cutArray[command[2] - 1];
            index++;
        }

        return answer;
    }
}
