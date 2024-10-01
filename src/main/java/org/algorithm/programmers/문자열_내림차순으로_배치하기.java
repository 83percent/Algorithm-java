package org.algorithm.programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*
    [프로그래머스] 문자열_내림차순으로_배치하기
 */
public class 문자열_내림차순으로_배치하기 {
    public String solutions(String s) {
        String answer = Arrays.stream(s.split("")).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                char c1 = o1.charAt(0);
                char c2 = o2.charAt(0);

                if(Character.isUpperCase(c1) ^ Character.isUpperCase(c2)) {
                    return Character.isUpperCase(c1) ? 1 : -1;
                } else {
                    return Character.compare(c2, c1);
                }
            }
        }).collect(Collectors.joining());

        return answer;
    }

    public static void main(String args[]) {
        int[] arr = {1,2,3,4};
        int sum = Arrays.stream(arr).sum();
        double avg = sum / arr.length;

    }
}
