package test.sort;

import org.algorithm.sort.No2309;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No2309Test {

    @ParameterizedTest
    @MethodSource("provideCase")
    public void testCode(int[] input, String resultOutput) {
        String actualOutput = TestUtil.captureOutput(() -> No2309.code(input));
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[]{20, 7, 23, 19, 10, 15, 25, 8, 13}, "7\n8\n10\n13\n19\n20\n23\n")
        );
    }

}
