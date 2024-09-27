package org.algorithm.programmers;


import java.util.*;
import java.util.stream.Stream;

/*
    숫자 짝궁
 */
public class NumberSet {
    public String solution(String X, String Y) {
        char[] charList1 = X.toCharArray();
        char[] charList2 = Y.toCharArray();
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> charMap = new HashMap<>();

        for(char c : charList1) {
            if (!charMap.containsKey(c)) {
                charMap.put(c, 0);
            }
            charMap.put(c, charMap.get(c) + 1);
        }

        for(char c :  charList2) {
            if(charMap.containsKey(c)) {
                int cnt = charMap.get(c);
                sb.append(c);
                if(--cnt <= 0) {
                    charMap.remove(c);
                }
            }
        }
        List<Integer> answerList = Stream.of(Integer.parseInt(sb.toString())).toList();
        answerList.sort(Comparator.reverseOrder());

        return answerList.toString();
    }
}
