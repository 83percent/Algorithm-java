package test.programmers;

import org.algorithm.programmers.ChangeUpperCase1;
import org.algorithm.programmers.KakaoGifts;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeUpperCase1Test {

    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String a, String resultOutput) {
        String actualOutput = TestUtil.captureOutput(() -> ChangeUpperCase1.solution(a));
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of("aBcDeFg", "AbCdEfG")
        );

    }
}
