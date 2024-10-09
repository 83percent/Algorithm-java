package test.programmers;

import org.algorithm.programmers.다리를_지나는_트럭;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 다리를_지나는_트럭_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int bridge_length, int weight, int[] truck_weights, int resultOutput) {
        int actualOutput = new 다리를_지나는_트럭().solution(bridge_length, weight, truck_weights);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(5, 5, new int[] {5,5,5,5,5}, 26),
                Arguments.of(3, 10, new int[] {9,1,9,1,9}, 19),
                Arguments.of(2, 100, new int[] {10,10,10,10}, 8),
                Arguments.of(2, 10, new int[] {7,4,5,6}, 8),
                Arguments.of(100, 100, new int[] {10}, 101),
                Arguments.of(100, 100, new int[] {10,10,10,10,10,10,10,10,10,10}, 110)
        );
    }
}
