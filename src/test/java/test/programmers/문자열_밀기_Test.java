package test.programmers;

import org.algorithm.programmers.문자열_밀기;
import org.algorithm.programmers.올바른_괄호;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 문자열_밀기_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String A, String B, int resultOutput) {
        int actualOutput = new 문자열_밀기().solution(A, B);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
        Arguments.of("hello", "ohell", 1),
                Arguments.of("apple", "elppa", -1),
                Arguments.of("atat", "tata", 1),
                Arguments.of("abc", "abc", 0)
        );
    }
}
