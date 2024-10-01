package test.programmers;

import org.algorithm.programmers.올바른_괄호;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class 올바른_괄호_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String s, boolean resultOutput) {
        boolean actualOutput = new 올바른_괄호().solution(s);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of("()()", true),
                Arguments.of("(())()", true),
                Arguments.of(")()(", false),
                Arguments.of("(()(", false)
        );
    }
}
