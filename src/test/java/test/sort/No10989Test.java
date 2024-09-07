package test.sort;

import org.algorithm.sort.No2750;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class No10989Test {

    @ParameterizedTest
    @MethodSource("provideCase")
    public void testCode(int[] input, String resultOutput) {
        String actualOutput = TestUtil.captureOutput(() -> No2750.code(input));
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[]{5,2,3,1,4,2,3,5,1,7}, "1\n1\n2\n2\n3\n3\n4\n5\n5\n7\n")
        );
    }

}
