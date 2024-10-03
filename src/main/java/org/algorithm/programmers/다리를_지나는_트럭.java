package org.algorithm.programmers;

import java.util.LinkedList;
import java.util.Queue;

/*
    [프로그래머스] 다리를 지나는 트럭
 */
public class 다리를_지나는_트럭 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sumWight = 0;

        Queue<Integer> queue = new LinkedList<>();
        for(int truckWeight : truck_weights) {
            queue.add(truckWeight);
        }

        int truckCnt = 0;
        while(!queue.isEmpty()) {
            while(!queue.isEmpty() && sumWight + queue.peek() <= weight) {
                sumWight += queue.poll();
                truckCnt++;
            }
            if(truckCnt > 0) answer += bridge_length + truckCnt - 1;

            sumWight = 0;
            truckCnt = 0;
        }

        return answer + 1;
    }
}
