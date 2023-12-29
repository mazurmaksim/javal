package generics.gen.methods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameElementsTest {
    SameElements sameElements = new SameElements();
    Integer[] arr1 = {
            1,
            2,
            3,
            4
    };
    Integer[] arr2 = {
            1,
            2,
            4,
            4
    };
    Integer[] arr3 = {
            1,
            2,
            3,
            4
    };
    String[] arr4 = {
            "Java",
            "World"
    };

    String[] arr6 = {
            "Java",
            "World"
    };

    @Test
    void compareIntegerArraysWhenDifferentElementsTest() {
        String result = sameElements.compareArrays(arr1, arr2);
        assertEquals("Arrays are different", result);
    }

    @Test
    void compareStringArraysWhenSameElementsTest() {
        String result = sameElements.compareArrays(arr4, arr6);
        assertEquals("Arrays have same order", result);
    }

    @Test
    void compareIntegerArraysWhenSameElementsTest() {
        String result = sameElements.compareArrays(arr1, arr3);
        assertEquals("Arrays have same order", result);
    }
}