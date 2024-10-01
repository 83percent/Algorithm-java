package test.programmers;

import org.algorithm.programmers.프로세스;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 프로세스_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[] priorities, int location, int resultOutput) {
        int actualOutput = new 프로세스().solution(priorities, location);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[] {2, 1, 3, 2}, 2, 1),
                Arguments.of(new int[] {1, 1, 9, 1, 1, 1}, 0, 5),
                Arguments.of(new int[] {1, 1, 1, 1}, 2, 3),
                Arguments.of(new int[] {2, 3, 2, 1, 3}, 3, 5)
        );
    }
}
