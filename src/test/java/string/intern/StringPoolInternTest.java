package string.intern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringPoolInternTest {

    @Test
    void stringInternCheck() {
        StringPoolIntern stringPoolIntern = new StringPoolIntern();
        boolean result = stringPoolIntern.stringInternCheck("123", "123");

        assertTrue(result);
    }
}