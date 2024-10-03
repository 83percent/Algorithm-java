package org.algorithm.programmers;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
    [프로그래머스] 다리를 지나는 트럭
 */
public class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        int index = 0;
        while(index < prices.length) {
            int current = prices[index];
            for(int t = 0; t < prices.length - index; t++) {
                if(current > prices[t + index] || t+1 == prices.length - index) {
                    answer[index] = t;
                    break;
                }
            }
            index++;
        }



        answer[answer.length - 1] = 0;
        return answer;
    }
}
