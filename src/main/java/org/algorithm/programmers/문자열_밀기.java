package org.algorithm.programmers;

public class 문자열_밀기 {

    public int solution(String A, String B) {

        String tmp = A;
        for(int i = 0; i < A.length(); i++) {
            if(tmp.equals(B)) {
                return i;
            } else {
                tmp =  tmp.charAt(tmp.length() - 1) + tmp.substring(0, tmp.length() - 1);
            }
        }
        return -1;
    }

}
