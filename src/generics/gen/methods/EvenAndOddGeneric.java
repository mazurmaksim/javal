package generics.gen.methods;

import java.util.List;
import java.util.function.Predicate;

public class EvenAndOddGeneric {
//create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.
//This method allows only classes and subclasses which extends Number
    public <T extends Number> double[] listSum(List<T> list, Predicate<T> function) {
        double evenSum = 0;
        double oddSum = 0;
        double[] result = new double[2];

        for (T el: list) {
            if(function.test(el)) {
                evenSum += el.doubleValue();
            } else {
                oddSum += el.doubleValue();
            }
        }
        result[0] = evenSum;
        result[1] = oddSum;
        return result;
    }

    public static <T extends Number> T max(T x, T y) {
        return x.doubleValue() > y.doubleValue() ? x : y;
    }
}
