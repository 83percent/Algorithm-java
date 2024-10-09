package org.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class No2309 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[9];
        for(int i = 0; i < 9; i++) {
            numbers[i] = scanner.nextInt();
        }

        code(numbers);
        scanner.close();
    }

    public static void code(int[] numbers) {
        Arrays.sort(numbers);
        int gap = Arrays.stream(numbers).sum() - 100;

        for(int x = 0; x < 9; x++) {
            for(int y = x+1; y < 9; y++) {
                int sum = numbers[x] + numbers[y];

                if(gap == sum) {
                    for(int i = 0; i < 9; i++) {
                        if(i != x && i != y) System.out.println(numbers[i]);
                    }
                    return;
                }
            }
        }
    }
}
