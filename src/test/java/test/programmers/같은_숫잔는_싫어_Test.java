package test.programmers;

import org.algorithm.programmers.같은_숫자는_싫어;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class 같은_숫잔는_싫어_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[] arr, int[] resultOutput) {
        int[] actualOutput = new 같은_숫자는_싫어().solution(arr);
        assertArrayEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[]{1,1,3,3,0,1,1}, new int[]{1,3,0,1}),
                Arguments.of(new int[] {4,4,4,3,3}, new int[]{4,3})
        );
    }
}
