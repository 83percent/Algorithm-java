package org.algorithm.programmers;

import java.util.*;

/*
    [프로그래머스] 단어 변환
    #DFS
 */
public class 단어_변환 {
    private int answer = 9999;
    public int solution(String begin, String target, String[] words) {
        if(!Arrays.stream(words).toList().contains(target)) return 0;
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add(begin);
        wordList.addAll(Arrays.stream(words).toList());


        int wordLength = begin.length();
        Set<String> chkSet = new HashSet<>();
        HashMap<String, ArrayList<String>> graph = new HashMap<>();
        HashMap<String, Boolean> visited = new HashMap<>();

        ArrayList<String> childList;
        for(String word : wordList) {
            childList = new ArrayList<>();

            for(String targetWord : words) {
                chkSet.clear();
                chkSet.addAll(Arrays.stream(word.split("")).toList());
                chkSet.addAll(Arrays.stream(targetWord.split("")).toList());

                if(chkSet.size() == wordLength + 1) childList.add(targetWord);
            }

            graph.put(word, childList);
            visited.put(word, false);
        }

        dfs(graph, begin, target, 0, visited);

        return answer == 9999 ? 0 : answer;
    }

    private void dfs(HashMap<String, ArrayList<String>> graph, String word, String target, int round, HashMap<String, Boolean> visited) {
        round++;
        visited.put(word, true);

        if(target.equals(word)) {
            if(answer > round) {
                answer = round;
                return;
            }
        }

        ArrayList<String> childList = graph.get(word);
        for(String next : childList) {
            if(!visited.get(next)) {
                dfs(graph, next, target, round, visited);
            }
        }
    }
}
