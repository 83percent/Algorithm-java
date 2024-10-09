package org.algorithm.programmers;

import java.util.*;

/*
    [프로그래머스] 같은 숫자는 싫어
 */
public class 같은_숫자는_싫어 {
    public int[] solution(int[] arr) {
        List<Integer> numberList = new ArrayList<>();
        numberList.add(arr[0]);
        for(int index = 1; index < arr.length; index++) {
            if(arr[index-1] != arr[index]) {
                numberList.add(arr[index]);
            }
        }

        return numberList.stream().mapToInt(Integer::intValue).toArray();
    }

    public String t(String s) {
        int length = s.length(); // 4, 0 1 2! 3, 1 2
        StringBuilder sb = new StringBuilder();
        if(length <= 2) {
            sb.append( s);
        } else if(length % 2 == 0) {


            sb.append(s.charAt(length / 2));
            sb.append(s.charAt(length / 2 - 1));
        } else {
            sb.append(s.charAt(length / 2 ));
        }
        return sb.toString();
    }
}
