package test.programmers;

import org.algorithm.programmers.가장_많이_받은_선물;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 가장_많이_받은_선물_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String[] friends, String[] gifts, int resultOutput) {
        int actualOutput = new 가장_많이_받은_선물().solution(friends, gifts);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of(new String[] {"muzi", "ryan", "frodo", "neo"}, new String[] {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}, 2),
                Arguments.of(new String[] {"joy", "brad", "alessandro", "conan", "david"}, new String[] {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"}, 4),
                Arguments.of(new String[] {"a", "b", "c"}, new String[] {"a b", "b a", "c a", "a c", "a c", "c a"}, 0)
        );
    }
}
