package org.algorithm.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BaekjoonSample {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        code(br);  // code 메서드 호출
        br.close();
    }

    public static void code(BufferedReader br) throws IOException {
        // 첫 번째 줄에서 노드 개수(n), 간선 개수(m), 시작 노드(s) 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());  // 노드 개수
        int m = Integer.parseInt(st.nextToken());  // 간선 개수
        int s = Integer.parseInt(st.nextToken());  // 시작 노드

        // 간선 정보 입력 처리
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());  // 첫 번째 노드
            int v = Integer.parseInt(st.nextToken());  // 두 번째 노드
            // 간선 처리 로직 (이 예제에서는 간선을 출력)
            System.out.println("Edge: " + u + " - " + v);
        }

    }

}
