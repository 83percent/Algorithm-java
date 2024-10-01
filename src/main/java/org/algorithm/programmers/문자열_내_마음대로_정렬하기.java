package org.algorithm.programmers;

import java.util.Arrays;
import java.util.Comparator;

/*
    [프로그래머스] 문자열 내 마음대로 정렬하기
 */
public class 문자열_내_마음대로_정렬하기 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};

        answer = Arrays.stream(strings).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int gap = Character.compare(o1.charAt(n), o2.charAt(n));
                if(gap != 0) {
                    return gap;
                } else {
                    return o1.compareTo(o2);
                }
            }
        }).toArray(String[]::new);

        System.out.println(answer);
        return answer;
    }
}
