package test.sort;

import org.algorithm.baekjoon.BaekjoonSample;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import test.util.TestUtil;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BaekjoonSampleTest {

    @ParameterizedTest
    @MethodSource("provideCase")
    public void testMain(String input, String resultOutput) throws IOException {
        // 가상의 입력을 ByteArrayInputStream으로 생성
        ByteArrayInputStream in = new ByteArrayInputStream(input.getBytes());
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        // System.in을 가상의 입력으로 대체
        System.setIn(in);

        // 실제 BaekjoonSample.main() 메서드 실행
        String actualOutput = TestUtil.captureOutput(() -> {
            try {
                BaekjoonSample.code(br);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });

        // 추가적인 검증을 위한 로직을 넣을 수 있습니다
        assertEquals(resultOutput, actualOutput);
    }

    private static Stream<Arguments> provideCase() {
        return Stream.of(
                Arguments.of("4 5 1\n1 2\n1 3\n1 4\n2 4\n3 4", "1 2 4 3\n1 2 3 4"),
                Arguments.of("5 5 3\n5 4\n 5 2\n 1 2\n 3 4\n3 1", "3 1 2 5 4\n3 1 4 2 5"),
                Arguments.of("1000 1 1000\n999 1000", "1000 999\n1000 999")
        );
    }
}
