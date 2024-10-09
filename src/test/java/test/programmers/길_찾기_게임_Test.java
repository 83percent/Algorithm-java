package test.programmers;

import org.algorithm.programmers.길_찾기_게임;
import org.algorithm.programmers.주식가격;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class 길_찾기_게임_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int[][] nodeinfo, int[][] resultOutput) {
        int[][] actualOutput = new 길_찾기_게임().solution(nodeinfo);
        assertArrayEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new int[][] {{5,3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}}, new int[][] {{7,4,6,9,1,8,5,2,3},{9,6,5,8,1,4,3,2,7}})
        );
    }
}
