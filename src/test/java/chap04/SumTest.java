package chap04;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SumTest {

    @Test
    void sum() {
        int result = 2+3;
        assertEquals(5, result);
    }
}
