package test.programmers;

import org.algorithm.programmers.MaximumNumber;
import org.algorithm.programmers.WordChain;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumNumberTest {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[] numbers, String resultOutput) {
        String actualOutput = TestUtil.captureOutput(() -> new MaximumNumber().solution(numbers));
        System.out.println(actualOutput);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[] {6, 10, 2}, "6210"),
                Arguments.of(new int[] {3, 30, 34, 5, 9}, "9534330")

        );
    }
}
