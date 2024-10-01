package test.programmers;

import org.algorithm.programmers.기능개발;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 기능개발_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[] progresses, int[] speeds, int[] resultOutput) {
        int[] actualOutput = new 기능개발().solution(progresses, speeds);
        assertArrayEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[] {93, 30, 55}, new int [] {1, 30, 5}, new int [] {2, 1}),
                Arguments.of(new int [] {95, 90, 99, 99, 80, 99}, new int [] {1, 1, 1, 1, 1, 1}, new int [] {1, 3, 2})
        );
    }
}
