package test.programmers;

import org.algorithm.programmers.다리를_지나는_트럭;
import org.algorithm.programmers.주식가격;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class 주식가격_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[] prices, int[] resultOutput) {
        int[] actualOutput = new 주식가격().solution(prices);
        assertArrayEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[] {1, 2, 3, 2, 3}, new int[] {4, 3, 1, 1, 0})
        );
    }
}
