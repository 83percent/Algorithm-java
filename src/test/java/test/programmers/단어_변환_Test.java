package test.programmers;

import org.algorithm.programmers.단어_변환;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 단어_변환_Test {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String begin, String target, String[] words, int resultOutput) {
        int actualOutput = new 단어_변환().solution(begin, target, words);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}, 4),
                Arguments.of("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"}, 0),
                Arguments.of("hit", "log", new String[]{"hot", "dot", "dog", "lot", "log"}, 4),
                Arguments.of("hit", "dot", new String[]{"hot", "dot", "dog"}, 2),
                Arguments.of("abc", "def", new String[]{"dbc", "dec", "def"}, 3)
        );
    }
}
