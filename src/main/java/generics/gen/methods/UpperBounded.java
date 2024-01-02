package generics.gen.methods;

import java.util.ArrayList;
import java.util.List;

public class UpperBounded {
    public static void main(String[] args) {
/*    This example demonstrates that we can read upper bounded types,
      but we can not insert item to a List<? extends Number>
      because you can not guarantee what list really pointing to. */
        List<? extends Number> l1 = new ArrayList<>();
//   I comment this line, because there are compile time error
//        l1.add(new Integer(23));

        // We can create list like this
        List<? extends Number> l2 = new ArrayList<Integer>();
        List<? extends Number> l3 = new ArrayList<Double>();
        List<? extends Number> l4 = new ArrayList<Float>();

        // we use upper bounded wildcards to read items
        showAll(l2);
    }

    public static void showAll(List<? extends Number> list) {
        for (Number n: list) {
            System.out.println(n);
        }
    }
}
