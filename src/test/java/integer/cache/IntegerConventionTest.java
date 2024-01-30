package integer.cache;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class IntegerConventionTest {

    @Test
    @DisplayName("Should be true, because 100 is less then 128")
    void integerConventionCheck() {
        IntegerConvention integerConvention = new IntegerConvention();
        boolean result = integerConvention.integerConventionCheck(-128, -128);
        assertTrue(result);
    }

    @Test
    @DisplayName("Should be false, because 130 is greater then 128")
    void integerConventionCheckFalseResult() {
        IntegerConvention integerConvention = new IntegerConvention();
        boolean result = integerConvention.integerConventionCheck(130, 130);
        assertFalse(result);
    }
}