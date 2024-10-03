package org.algorithm.programmers;

import java.util.*;

public class 네트워크 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for(int x = 0; x < n; x++) {
            for(int y = x + 1; y < n; y++) {
                if(computers[x][y] == 1) {
                    graph.get(x).add(y);
                    graph.get(y).add(x);
                }

            }
        }

        int[] networks = new int[n];
        Arrays.fill(networks, -1);

        Queue<Integer> queue;
        for(int i = 0; i < n; i++) {
            if(networks[i] == -1) {
                queue = new LinkedList<>();
                queue.offer(i);
                networks[i] = i;

                while(!queue.isEmpty()) {
                    int nowComputer = queue.poll();
                    for(int nextComputer : graph.get(nowComputer)) {
                        if(networks[nextComputer] == -1) {
                            networks[nextComputer] = i;
                            queue.offer(nextComputer);
                        }
                    }
                }
            }
        }

        Set<Integer> networkSet = new LinkedHashSet<>();
        for(int network : networks) {
            if(network >= 0) {
                networkSet.add(network);
            } else {
                answer++;
            }
        }
        return answer + networkSet.size();
    }
}
