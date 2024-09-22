package test.programmers;

import org.algorithm.programmers.ChangeUpperCase1;
import org.algorithm.programmers.NearBlock;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NearBlockTest {

    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String[][] board, int h, int w, int resultOutput) {
        String actualOutput = TestUtil.captureOutput(() -> new NearBlock().solution(board, h, w));
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of()
        );

    }
}
