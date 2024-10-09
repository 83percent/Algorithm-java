package org.algorithm.programmers;

import java.util.*;

/*
    [프로그래머스] 기능 개발
 */
public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> taskQueue = new ArrayDeque<>();
        Deque<Integer> speedQueue = new ArrayDeque<>();

        for(int i = 0; i < progresses.length; i++) {
            taskQueue.add(progresses[i]);
            speedQueue.add(speeds[i]);
        }

        int days = 1;
        int answer = 0;
        boolean deploy = false;

        List<Integer> answerList = new ArrayList<>();
        while(!taskQueue.isEmpty() && !speedQueue.isEmpty()) {
            int priorityTask = taskQueue.peek();
            int speed = speedQueue.peek();
            if(priorityTask + (speed * days) >= 100) {
                taskQueue.poll();
                speedQueue.poll();

                answer++;
                deploy = true;
            } else {
                deploy = false;
            }

            if(!deploy) {
                days++;
                if(answer > 0) {
                    answerList.add(answer);
                    answer = 0;
                }

            }
        }

        if(answer > 0) {
            answerList.add(answer);
        }

        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
