package test.programmers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 퍼즐_게임_챌린지_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[] diffs, int[] times, long limit, int resultOutput) {
        int actualOutput = new org.algorithm.programmers.퍼즐_게임_챌린지().solution(diffs, times, limit);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[]{1, 5, 3}, new int[] {2, 4, 7}, 30, 3),
                Arguments.of(new int[]{1, 4, 4, 2}, new int[] {6, 3, 8, 2}, 59, 2),
                Arguments.of(new int[]{1, 328, 467, 209, 54}, new int[]{2, 7, 1, 4, 3}, 1723, 294),
                Arguments.of(new int[]{1, 99999, 100000, 99995}, new int[] {9999, 9001, 9999, 9001}, 3456789012L, 39354)
        );
    }
}
