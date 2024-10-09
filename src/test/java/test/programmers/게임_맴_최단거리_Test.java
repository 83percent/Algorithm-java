package test.programmers;

import org.algorithm.programmers.게임_맵_최단거리;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 게임_맴_최단거리_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[][] maps, int resultOutput) {
        int actualOutput = new 게임_맵_최단거리().solution(maps);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[][] {{1, 0},{1, 1}}, 3),
                Arguments.of(new int[][]{{1}}, 1),
                Arguments.of(new int[][]{{1, 1, 1, 1}, {1, 0, 0, 0}, {1, 1, 1, 0}, {0, 0, 1, 1}}, 7),
                Arguments.of(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}, 11),
                Arguments.of(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}}, -1)
        );
    }
}
