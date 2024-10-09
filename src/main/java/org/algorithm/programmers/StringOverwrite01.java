package org.algorithm.programmers;

/**
 * 프로그래머스 문자열 겹쳐쓰기
 */
public class StringOverwrite01 {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder stringBuilder = new StringBuilder(my_string);
        int e = overwrite_string.length();
        return stringBuilder.replace(s, s + e, overwrite_string).toString();
    }
}
