package org.algorithm.baekjoon;

/*
    [백준] DFS와 BFS
    #DFS #BFS
 */

    import java.io.*;
    import java.util.*;

    public class No1260 {
        public static void main(String args[]) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            code(br);  // code 메서드 호출
            br.close();
        }

        public static void code(BufferedReader br) throws IOException {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());  // 노드 개수
            int m = Integer.parseInt(st.nextToken());  // 간선 개수
            int s = Integer.parseInt(st.nextToken());  // 시작 노드

            List<PriorityQueue<Integer>> graph = new ArrayList<>();
            for(int i = 0; i <= n; i++) {
                graph.add(new PriorityQueue<>());
            }

            for(int i = 0; i < m; i++) {
                String[] node = br.readLine().split(" ");
                graph.get(Integer.parseInt(node[0])).add(Integer.parseInt(node[1]));
                graph.get(Integer.parseInt(node[1])).add(Integer.parseInt(node[0]));
            }
            bw.write(dfs(graph, s, n));
            bw.newLine();
            bw.write(bfs(graph, s, n));

            bw.flush();
            bw.close();

        }

        public static String dfs(List<PriorityQueue<Integer>> graph, int startVertex, int vertexLength) {
            boolean[] visited = new boolean[vertexLength + 1];
            Arrays.fill(visited, false);

            return dfs2(graph, startVertex, new ArrayList<>(), visited);
        }

        public static String dfs2(List<PriorityQueue<Integer>> graph, int node, List<String> path, boolean[] visited) {
            visited[node] = true;
            path.add(String.valueOf(node));

            for(int next : graph.get(node)) {
                if(!visited[next]) {
                    dfs2(graph, next, path, visited);
                }
            }

            return String.join(" ", path);
        }

        public static String bfs(List<PriorityQueue<Integer>> graph, int startVertex, int vertexLength) throws IOException {
            boolean[] visited = new boolean[vertexLength + 1];
            Arrays.fill(visited, false);

            Queue<Integer> queue = new LinkedList<>();
            queue.offer(startVertex);
            visited[startVertex] = true;

            List<String> resultList = new ArrayList<>();

            while(!queue.isEmpty()) {
                int currentVertex = queue.poll();
                resultList.add(String.valueOf(currentVertex));
                for(int nextVertex : graph.get(currentVertex)) {
                    if(!visited[nextVertex]) {
                        queue.offer(nextVertex);
                        visited[nextVertex] = true;
                    }
                }
            }

            return String.join(" ", resultList);
        }
    }
