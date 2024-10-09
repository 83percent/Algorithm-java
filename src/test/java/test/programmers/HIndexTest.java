package test.programmers;

import org.algorithm.programmers.HIndex;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HIndexTest {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[] citations, int resultOutput) {
        int actualOutput = new HIndex().solution(citations);
        System.out.println(actualOutput);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[]{3, 0, 6, 1, 5}, 3),
                Arguments.of(new int[] {1,1,1,1,1,1,1, 0}, 1),
                Arguments.of(new int[] {1,4,5,8,2,10,8,13,18,23}, 5)
        );
    }
}
