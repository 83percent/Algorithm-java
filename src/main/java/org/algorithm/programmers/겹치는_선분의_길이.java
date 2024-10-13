package org.algorithm.programmers;

import java.util.*;
import java.util.stream.IntStream;

public class 겹치는_선분의_길이 {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] array  = new int[201];
        Arrays.fill(array, 0);

        for(int[] line : lines) {
            for(int i = line[0] + 100; i <= line[1] + 100; i++) {
                array[i]++;
            }
        }


        int cm = -1;
        for (int j : array) {
            if (j > 1) {
                cm++;
            } else {
                if (cm >= 0) {
                    answer += cm;
                    cm = -1;
                }
            }
        }

        return answer;
    }
}
