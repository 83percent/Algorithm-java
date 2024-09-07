package test.util;

import org.junit.jupiter.api.Nested;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

@Nested
public class TestUtil {
    public static String captureOutput(Runnable action) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        action.run();

        System.setOut(originalOut);
        return outputStream.toString();
    }

}
