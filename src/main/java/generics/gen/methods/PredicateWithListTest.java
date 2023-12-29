package generics.gen.methods;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PredicateWithListTest {
    PredicateWithList predicate = new PredicateWithList();
    List< Integer > numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);

    @Test
    void shouldReturnArrayWithEvenNumbers(){
        List<Integer> result = predicate.listWithPredicate(numbers, n-> n%2 == 0);
        assertEquals(result, List.of(2,4,6,8,10,12));
    }

    @Test
    void shouldReturnArrayWithOddNumbers(){
        List<Integer> result = predicate.listWithPredicate(numbers, n-> n%2 != 0);
        assertEquals(result, List.of(1,3,5,7,9,11));
    }

}