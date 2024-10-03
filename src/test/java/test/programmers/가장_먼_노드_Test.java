package test.programmers;

import org.algorithm.programmers.가장_먼_노드;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 가장_먼_노드_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int n, int[][] edges, int resultOutput) {
        int actualOutput = new 가장_먼_노드().solution(n, edges);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(6, new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}}, 3)
        );
    }
}
