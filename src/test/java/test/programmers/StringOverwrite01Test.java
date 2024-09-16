package test.programmers;

import org.algorithm.programmers.ChangeUpperCase1;
import org.algorithm.programmers.StringOverwrite01;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringOverwrite01Test {

    @ParameterizedTest
    @MethodSource("provideCase")
    public void test(String my_string, String overwrite_string, int s, String resultOutput) {
        String actualOutput =  new StringOverwrite01().solution(my_string, overwrite_string, s);
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of("He11oWor1d","lloWorl",2,"HelloWorld"),
                Arguments.of("Program29b8UYP","merS123",7,"ProgrammerS123")
        );

    }
}
