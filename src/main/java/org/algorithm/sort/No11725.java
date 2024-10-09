package org.algorithm.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
    [백준] 트리의 부모 찾기
    #트리 #노드 #부모찾기
 */
public class No11725 {
    public static void main(String args) throws IOException {

        class Node {
            int value;
            List<Node> childList;

            Node(int value) {
                this.value = value;
                this.childList = new ArrayList<>();
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] nodeStringArray = new String[n - 1];
        for(int i = 0; i < n-1; i++) {
            nodeStringArray[i] = br.readLine();
        }

        Node[] nodeArray = new Node[n];
        for(int i = 0; i < n; i++) {
            nodeArray[i] = new Node(i);
        }

        int[][] edgeArray = new int[nodeStringArray.length][2];
        for(int i = 0; i < nodeStringArray.length; i++) {
            String[] edgeStringArray = nodeStringArray[i].split("");
            int a = Integer.parseInt(edgeStringArray[0]);
            int b = Integer.parseInt(edgeStringArray[1]);

            edgeArray[i] = a < b ? new int[]{a,b} : new int[]{b, a};
        }

        Arrays.sort(edgeArray, Comparator.comparingInt(a -> a[0]));
        Node rootNode = nodeArray[0];
        for(int i = 1; i < nodeArray.length; i++) {

        }
    }
}
