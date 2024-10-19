package org.algorithm.programmers;

import java.util.*;

public class 완주하지_못한_선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = null;
        Map<String, Integer> map = new HashMap<>();
        for(String name : completion) {
            if(map.get(name) == null) map.put(name, 1);
            else map.put(name, map.get(name) + 1);
        }

        for(String name : participant) {
            if(map.get(name) == null || map.get(name) == 0) {
                answer = name;
                break;
            } else {
                map.put(name, map.get(name) - 1);
            }
        }

        return answer;
    }
}
