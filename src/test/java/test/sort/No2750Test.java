package test.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.algorithm.sort.No2750;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

public class No2750Test {

    @ParameterizedTest
    @MethodSource("provideCase")
    public void testCode(int[] input, String resultOutput) {
        String actualOutput = TestUtil.captureOutput(() -> No2750.code(input));
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[]{3,1,2}, "1\n2\n3\n"),
                Arguments.of(new int[]{5,2,3,4,1}, "1\n2\n3\n4\n5\n"),
                Arguments.of(new int[]{10,20,30,40,50}, "10\n20\n30\n40\n50\n")
        );
    }

}
