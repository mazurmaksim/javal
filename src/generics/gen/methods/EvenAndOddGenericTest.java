package generics.gen.methods;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddGenericTest {
    EvenAndOddGeneric evenAndOddGeneric = new EvenAndOddGeneric();
    List<Double> doubleList = Arrays.asList(5.0,3.0,8.0);
    List<Integer> integerList = List.of(2,4,6,9,4,1,3);

    @Test
    void whenElementsIsDoubleTest() {
        Predicate<Double> evenPredicate = num-> num %2 == 0;
        double[] result = evenAndOddGeneric.listSum(doubleList, evenPredicate);
        assertEquals(result[0], 8.0);
        assertEquals(result[1], 8.0);
    }

    @Test
    void whenElementsIsIntegerTest() {
        Predicate<Integer> evenPredicate = num-> num %2 == 0;
        double[] result = evenAndOddGeneric.listSum(integerList, evenPredicate);
        assertEquals(result[0], 16);
        assertEquals(result[1], 13);
    }
}