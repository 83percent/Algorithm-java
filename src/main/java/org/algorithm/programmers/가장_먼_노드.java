package org.algorithm.programmers;

import java.util.*;

/*
    [프로그래머스] 가장 먼 노드
    #그래프
 */
public class 가장_먼_노드 {

    public int solution(int n, int[][] edge) {
        int answer = 0;

        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0 ; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int[] e : edge) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }

        int[] distances = new int[n + 1];
        Arrays.fill(distances, -1);
        distances[1] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);

        while(!queue.isEmpty()) {
            int vertex = queue.poll();
            for(int nextVertex : graph.get(vertex)) {
                if(distances[nextVertex] == -1) {
                    queue.offer(nextVertex);
                    distances[nextVertex] = distances[vertex] + 1;
                }
            }
        }

        Arrays.sort(distances);
        int maxDistance = distances[distances.length - 1];
        for(int index = distances.length - 1; index >= 0; index--) {
            if(distances[index] == maxDistance) {
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }
}
