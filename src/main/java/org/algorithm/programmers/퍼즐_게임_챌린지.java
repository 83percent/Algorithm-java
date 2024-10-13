package org.algorithm.programmers;

import java.util.Arrays;

/*
    [프로그래머스] 퍼즐_게임_챌린지
    TODO : 시간 초과 발생하여 로직 변경해야함.
 */
public class 퍼즐_게임_챌린지 {
    public int solution(int[] diffs, int[] times, long limit) {
        int answer = 0;
        int minLevel = 0;
        int maxLevel = 0;
        int[] cloneDiffs = diffs.clone();
        Arrays.sort(cloneDiffs);

        // 난이도 대상으로 해결할 수 있는 최소 난이도 구하기
        for(int diff : cloneDiffs) {
            if(this.playGame(diffs, times, limit, diff)) {
                maxLevel = diff;
                break;
            } else {
                minLevel = diff;
            }
        }

        answer = minLevel;
        for(int level = minLevel; level <= maxLevel; level++) {
            if(this.playGame(diffs, times, limit, level)) {
                answer = level;
                break;
            }
        }

        return answer;
    }

    private boolean playGame(int[] diffs, int[] times, long limit, int level) {
        long spendTime = 0;
        for(int round = 0; round < diffs.length; round++) {
            if(diffs[round] <= level) {
                spendTime += times[round];
            } else {
                spendTime += (long) (times[round] + times[round - 1]) * (diffs[round] - level) + times[round];
            }

            if(limit < spendTime) {
                return false;
            }
        }
        return true;
    }
}
