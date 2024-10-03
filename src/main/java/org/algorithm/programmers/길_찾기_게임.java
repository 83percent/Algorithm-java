package org.algorithm.programmers;

import java.util.Arrays;

/*
    [프로그래머스] 길 찾기 게임
 */
public class 길_찾기_게임 {
    public int[][] solution(int[][] nodeinfo) {
        int[][] answer = {{1,2}};

        Node[] nodeArray = new Node[nodeinfo.length];
        for(int i = 0; i < nodeArray.length; i++) {
            nodeArray[i]  = new Node(i, nodeinfo[i][0], nodeinfo[i][1]);
        }

        Arrays.sort(nodeArray, (a, b) -> {
            if(a.y == b.y) {
                return a.x - b.x;
            } else {
                return b.y - a.y;
            }
        });

        Node rootNode = nodeArray[0];
        for(int i = 1; i < nodeArray.length; i++) {

        }

        return answer;
    }

    private void insertNode(Node root, Node child) {

    }

    public class Node {
        int value;
        int x;
        int y;
        Node left;
        Node right;

        public Node(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
            left = null;
            right = null;
        }
    }
}
