package generics.gen.methods;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TargetObjectGenericTest {
    TargetObjectGeneric targetObjectGeneric = new TargetObjectGeneric();
    List < Integer > numbers = List.of(1, 2, 3, 4, 5);
    List< String > colors = List.of("Red", "Green", "Blue", "Orange", "White");

    @Test
    void getIntegerIndexFromList() {
        int result = targetObjectGeneric.getTargetFromList(numbers, 3);
        assertEquals(result, 2);
    }

    @Test
    void getNotExistIntegerIndexFromList() {
        int result = targetObjectGeneric.getTargetFromList(numbers, 99);
        assertEquals(result, -1);
    }

    @Test
    void getStringIndexFromList() {
        int result = targetObjectGeneric.getTargetFromList(colors, "Blue");
        assertEquals(result, 2);
    }

    @Test
    void getNotExistStringIndexFromList() {
        int result = targetObjectGeneric.getTargetFromList(colors, "99");
        assertEquals(result, -1);
    }
}