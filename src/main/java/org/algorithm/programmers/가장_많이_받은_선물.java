package org.algorithm.programmers;

import java.util.HashMap;
import java.util.Map;

/*
    [프로그래머스] 같은 숫자는 싫어
 */
public class 가장_많이_받은_선물 {



    public int solution(String[] friends, String[] gifts) {
        HashMap<String, Integer> toMap;
        HashMap<String, Integer> recordMap;
        HashMap<String, HashMap<String, Integer>> fromMap = new HashMap<>();

        // Init
        for(String me : friends) {
            toMap = new HashMap<>();
            recordMap = new HashMap<>();
            for(String friend : friends) {
                toMap.put(friend, 0);
            }
            fromMap.put(me, toMap);

            recordMap.put("allFrom", 0);
            recordMap.put("allTo", 0);
            recordMap.put("giftIndex", 0);

            fromMap.put("record", recordMap);

        }

        // Map
        for(String gift : gifts){
            String[] record = gift.split(" ");
            String from = record[0];
            String to = record[1];

            HashMap<String, Integer> targetMap = fromMap.get(from);
            targetMap.put(to, targetMap.get(to)+1);
        }

        // gift index
        // for(String gift)


        return 0;
    }
}
