package test.backjoon;

import backjoon.Backjoon2644;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Backjoon2644Test {

    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int n, int[] target, int[][] nodes, int answer) {
        Backjoon2644 C = new Backjoon2644();
        String output = TestUtil.captureOutput(() -> C.solution(n, target, nodes));
        assertEquals(String.valueOf(answer), output);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(9 ,new int[] {7,3},  new int[][] {{1,2}, {1,3}, {2,7}, {2,8}, {2,9}, {4,5}, {4,6}}, 3),
                Arguments.of(9 ,new int[] {8,6}, new int[][] {{1,2}, {1,3}, {2,7}, {2,8}, {2,9}, {4,5}, {4,6}}, -1)
        );
    }

}
