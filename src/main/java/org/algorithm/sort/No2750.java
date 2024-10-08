package org.algorithm.sort;

import java.util.Arrays;
import java.util.Scanner;

public class No2750 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for(int i=0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        code(numbers);
        scanner.close();
    }

    public static void code(int[] numbers) {
        Arrays.sort(numbers);
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
