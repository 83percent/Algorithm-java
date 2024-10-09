package org.algorithm.programmers;

import java.util.*;

/*
    [프로그래머스] 프로세스
 */
public class 프로세스 {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
        for(int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {i, priorities[i]});
            priorityQueue.add(priorities[i]);
        }

        int index = 1;
        while(!queue.isEmpty()) {
            int[] task = queue.poll();
            int maxPriority = priorityQueue.peek();
            if(maxPriority > task[1]) {
                queue.add(task);
            } else if(maxPriority == task[1]) {
                if(task[0] == location) {
                    break;
                } else {
                    priorityQueue.poll();
                    index++;
                }

            }
        }

        return index;

    }
}
