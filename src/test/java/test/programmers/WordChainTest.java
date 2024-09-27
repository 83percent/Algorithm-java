package test.programmers;

import org.algorithm.programmers.WordChain;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordChainTest {
    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(int n, String[] words, int[] resultOutput) {
        WordChain wordChain = new WordChain();
        String actualOutput = TestUtil.captureOutput(() -> wordChain.solution(n, words));
        // int[] actualOutput = wordChain.solution(n, words);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                //Arguments.of(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}, new int[]{3,3}),
                //Arguments.of(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}, new int[] {0,0}),
                Arguments.of(2,new String[]{"hello", "one", "even", "never", "now", "world", "draw"}, new int[]{1,3})
        );

    }
}
