package test.sort;

import org.algorithm.sort.No10817;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No10817Test {

    @ParameterizedTest
    @MethodSource("provideCase")
    public void testCode(int[] input, String resultOutput) {
        String actualOutput = TestUtil.captureOutput(() -> No10817.code(input));
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[] {20, 30, 10}, "20"),
                Arguments.of(new int[] {30, 30, 10}, "30"),
                Arguments.of(new int[] {40, 40, 40}, "40"),
                Arguments.of(new int[] {20, 10, 10}, "10")
        );
    }


}
