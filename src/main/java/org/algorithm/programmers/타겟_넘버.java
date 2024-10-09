package org.algorithm.programmers;

/*
    [프로그래머스] 타겟넘버
    #BFS #DFS
 */
public class 타겟_넘버 {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }

    public void dfs(int[] numbers, int target, int index, int sum) {
        if(index == numbers.length) {
            if(sum == target) answer++;
            return;
        }

        dfs(numbers, target, index + 1, sum + numbers[index]);
        dfs(numbers, target, index + 1, sum - numbers[index]);
    }
}
