package test.programmers;

import org.algorithm.programmers.FruitSeller;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FruitSellerTest {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int k, int m, int[] score, int resultOutput) {
        FruitSeller fruitSeller = new FruitSeller();
        int actualOutput = fruitSeller.solution(k, m, score);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(3, 4, new int[]{1, 2, 3, 1, 2, 3, 1}, 8),
                Arguments.of(4, 3, new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2}, 33)
        );

    }
}
