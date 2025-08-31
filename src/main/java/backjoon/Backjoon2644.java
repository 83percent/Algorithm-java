package backjoon;

import java.util.*;

public class Backjoon2644 {

    public void solution(int n, int[] target, int[][] nodes) {
        int[] checker = new int[n];
        Arrays.fill(checker, -1);
        checker[target[0] - 1] = 0;

        Queue<Integer> queue = new LinkedList<>();
        queue.add(target[0]);

        Map<Integer, ArrayList<Integer>> graph = this.createGraph(nodes);

        while(!queue.isEmpty()) {
            int current = queue.poll();
            int now = checker[current - 1];

            for(int next : graph.get(current)) {
                if(next == target[1]) {
                    System.out.print(now + 1);
                    return;
                }
                if(checker[next - 1] == -1) {
                    checker[next -1] = now + 1;
                    queue.add(next);
                }
            }

        }

        System.out.print(-1);
    }

    private Map<Integer, ArrayList<Integer>> createGraph(int[][] nodes) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();

        for(int[] node : nodes) {
            if(!graph.containsKey(node[0]))
                graph.put(node[0], new ArrayList<>());

            graph.get(node[0]).add(node[1]);

            if(!graph.containsKey(node[1]))
                graph.put(node[1], new ArrayList<>());

            graph.get(node[1]).add(node[0]);
        }

        return graph;
    }





}
