package generics.gen.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateWithList {
    //    generic method that takes a list of any type and a predicate.
    //    It returns an array list containing only elements that satisfy the predicate.
    public <T> List<T> listWithPredicate(List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T el : list) {
            if (predicate.test(el)) {
                result.add(el);
            }
        }
        return result;
    }
}
