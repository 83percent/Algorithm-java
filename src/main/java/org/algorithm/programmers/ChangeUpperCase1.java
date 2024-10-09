package org.algorithm.programmers;

import java.util.Scanner;

/**
 * Programmers 대소문 바꿔서 출력하기
 */
public class ChangeUpperCase1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println(solution(string));
    }

    public static String solution(String a) {
        StringBuffer resultBuffer = new StringBuffer();

        for(char s : a.toCharArray()) {
            if(Character.isUpperCase(s)) {
                resultBuffer.append(Character.toLowerCase(s));
            } else {
                resultBuffer.append(Character.toUpperCase(s));
            }
        }
        System.out.println(resultBuffer.toString());
        return resultBuffer.toString();
    }
}
