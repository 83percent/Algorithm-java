package test.programmers;

import org.algorithm.programmers.NumberSet;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSetTest {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String X, String Y, String resultOutput) {
        NumberSet numberSet = new NumberSet();
        String actualOutput = numberSet.solution(X,Y);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of("100","2345","-1"),
                Arguments.of("100","203045","0"),
                Arguments.of("100","123450","10"),
                Arguments.of("12321","42531","321"),
                Arguments.of("5525","1255","552")
        );

    }
}
