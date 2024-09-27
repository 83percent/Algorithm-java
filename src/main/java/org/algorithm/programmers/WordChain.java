package org.algorithm.programmers;

import java.util.HashSet;
import java.util.Set;

/*
    프로그래머스 영어 끝말잇기
 */
public class WordChain {
    public int[] solution(int n, String[] words) {
        int index = 1;
        Set<String> duplicateWordCheckSet = new HashSet<>();

        char lastChar = words[0].charAt(0);
        for(String word : words) {
            if(!duplicateWordCheckSet.contains(word)) {
                duplicateWordCheckSet.add(word);
            } else {
                return new int[] {(index % n) == 0 ? n : index % n, (int) Math.ceil((double) index / (double) n)};
            }

            if(lastChar == word.charAt(0)) {
                lastChar = word.charAt(word.length() - 1);
            } else {
                return new int[] {(index % n) == 0 ? n : index % n, (int) Math.ceil((double) index / (double) n)};
            }
            index++;
        }

        return new int[] {0,0};
    }
}
