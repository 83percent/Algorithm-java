package org.algorithm.programmers;

import java.util.*;

public class 게임_맵_최단거리 {

    public int solution(int[][] maps) {
        List<List<Integer>> graph = new ArrayList<>();
        int height = maps.length;
        int width = maps[0].length;
        int mapSize = height * width;
        for(int i = 0; i < mapSize; i++) {
            graph.add(new ArrayList<>());
        }

        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                if(maps[y][x] == 0) continue;
                int i = (y * width) + x;

                List<Integer> targetList = graph.get(i);

                if(y - 1 >= 0 && maps[y-1][x] == 1) { // Up
                    targetList.add(((y - 1) * width) + x);
                }

                if(y + 1 < height && maps[y+1][x] == 1) { // Down
                    targetList.add(((y + 1) * width) + x);
                }

                if(x - 1 >= 0 && maps[y][x-1] == 1) { // left
                    targetList.add(i - 1);
                }

                if(x + 1 < width && maps[y][x+1] == 1) { // right
                    targetList.add(i + 1);
                }
            }
        }

        int[] distance = new int[mapSize];
        Arrays.fill(distance, 0);
        distance[0] = 1;

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);

        boolean isFind = false;

        while(!queue.isEmpty() && !isFind) {
            int currentNode = queue.poll();

            if(currentNode == mapSize - 1) {
                isFind = true;
            }

            for(int nextNode : graph.get(currentNode)) {
                if(distance[nextNode] == 0) {
                    queue.offer(nextNode);
                    distance[nextNode] = distance[currentNode] + 1;
                }
            }
        }


        return isFind ? distance[mapSize - 1] : -1;
    }

}
