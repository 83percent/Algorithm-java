package test.programmers;

import org.algorithm.programmers.K번째수;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class K번째수Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[] array, int[][] commands, int[] resultOutput) {
        String actualOutput = TestUtil.captureOutput(() -> new K번째수().solution(array, commands));
        System.out.println(actualOutput);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{new int[]{2, 5, 3}, new int[]{4, 4, 1}, new int[]{1, 7, 3}}, new int[]{5, 6, 3})
        );
    }
}
