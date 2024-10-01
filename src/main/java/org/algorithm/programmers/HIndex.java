package org.algorithm.programmers;

import java.util.Arrays;

/*
    [프로그래머스] H-Index
 */
public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        int n = citations.length; // 전체 논문 수
        int h; // 인용된 횟수

        Arrays.sort(citations); // 오름차순으로 정렬

        for(int index = 0; index < n; index++) {
            h = citations[index]; // 인용된 횟수
            if(h >= n-index) {
                answer = n - index;
                break;
            }

        }

        return answer;
    }
}
