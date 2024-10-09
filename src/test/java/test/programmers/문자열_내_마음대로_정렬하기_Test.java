package test.programmers;

import org.algorithm.programmers.HIndex;
import org.algorithm.programmers.문자열_내_마음대로_정렬하기;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 문자열_내_마음대로_정렬하기_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String[] strings, int n, String[] resultOutput) {
        String actualOutput = TestUtil.captureOutput(() -> new 문자열_내_마음대로_정렬하기().solution(strings, n));
        System.out.println(actualOutput);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new String[] {"sun", "bed", "car"}, 1, new String[] {"car", "bed", "sun"}),
                Arguments.of(new String[] {"abce", "abcd", "cdx"}, 2, new String[]{"abcd", "abce", "cdx"})
        );
    }
}
