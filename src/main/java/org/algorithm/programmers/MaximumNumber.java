package org.algorithm.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/*
    [프로그래머스] 가장 큰 수
 */
public class MaximumNumber {
    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .sorted(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        String case1 = o1 + o2;
                        String case2 = o2 + o1;
                        return case2.compareTo(case1);
                    }
                })
                .collect(Collectors.joining());
        return answer.charAt(0) == '0' ? "0" : answer;

    }
}
