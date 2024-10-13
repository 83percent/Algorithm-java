package test.programmers;

import org.algorithm.programmers.겹치는_선분의_길이;
import org.algorithm.programmers.문자열_밀기;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 결치는_선분의_길이_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[][] lines, int resultOutput) {
        int actualOutput = new 겹치는_선분의_길이().solution(lines);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[][] {{0, 1}, {2, 5}, {3, 9}}, 2),
                Arguments.of(new int[][] {{-1, 1}, {1, 3}, {3, 9}}, 0),
                Arguments.of(new int[][] {{0, 5}, {3, 9}, {1, 10}}, 8)
        );
    }
}
