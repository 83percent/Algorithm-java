package org.algorithm.programmers;

import java.util.Arrays;

/*
    프로그래머스 과일장수
 */
public class FruitSeller {
    public int solution(int k, int m, int[] score) {
        int maxPrice = 0;
        Arrays.sort(score);

        for(int index = score.length - m; index >= 0; index-=m) {
            int minScoreInBox = score[index];
            maxPrice += score[index] * m;
        }

        return maxPrice;
    }
}
