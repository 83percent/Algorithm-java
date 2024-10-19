package test.programmers;

import org.algorithm.programmers.완주하지_못한_선수;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 완주하지_못한_선수_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String[] participant, String[] completion, String resultOutput) {
        String actualOutput = new 완주하지_못한_선수().solution(participant, completion);
        System.out.println(actualOutput);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}, "leo"),
                Arguments.of(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}, "vinko"),
                Arguments.of(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{"stanko", "ana", "mislav"}, "mislav")
        );
    }
}
