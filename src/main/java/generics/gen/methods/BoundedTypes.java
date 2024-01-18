package generics.gen.methods;

//construct a generic method that takes a T[] one-dimensional array as the input with a T item and it counts that
//        how many items are greater than this specified T item.
//        For example:
//        [1, 2, 3, 4, 5] and item=3 --> result is 2 because 4, 5 are greater than 3.
//        [1.4, 2.1, 3.9, 4.3, 5.1] and item=2.0 --> result is 4 because 2.1, 3.9, 4.3, 5.1 are greater than 2.0.
//        ["a", "b", "f", "d", "e"] and item="c" --> result is 3 because "f", "d", "e"
//        are greater than "c" in the alphabetical order.
public class BoundedTypes {
    public static void main(String[] args) {
        Double[] arr = {1.4, 2.1, 3.9, 4.3, 5.1};
        String[] strs = {"a", "b", "f", "d", "e"};

        System.out.println(countGreaterItems(arr, 2.0));
        System.out.println(countGreaterItems(strs, "c"));
    }
    public static <T extends Comparable<T>> int countGreaterItems(T[] items, T item) {
        int result = 0;
        for (T el: items) {
            if(el.compareTo(item) > 0) {
                result++;
            }
        }
        return result;
    }
}
