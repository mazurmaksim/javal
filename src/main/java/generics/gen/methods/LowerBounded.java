package generics.gen.methods;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LowerBounded {

    public static void showAll(List<? super Number> list) {
        for(Object num : list) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        List<? super Number> lst = new ArrayList<>();
        lst.add(23);

        // how to read items from using a lower bounded wildcard
        List<Serializable> list = new ArrayList<>();
        list.add("Adam");
        list.add("Kevin");

    }
}
