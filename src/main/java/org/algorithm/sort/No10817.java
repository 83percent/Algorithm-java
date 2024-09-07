package org.algorithm.sort;

import java.util.*;

public class No10817 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] values = line.split(" ");
        int[] numbers = Arrays.stream(values).mapToInt(Integer::parseInt).toArray();
        code(numbers);
    }

    public static void code(int[] numbers) {
        Arrays.sort(numbers);
        System.out.print(numbers[1]);
    }
}
