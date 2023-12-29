package main.java.generics.gen.methods;

import java.util.ArrayList;
import java.util.List;


//Type inference is a Java compiler's ability to look at each method invocation and corresponding declaration to
// determine the type argument (or arguments) that make the invocation applicable. The inference algorithm determines
// the types of the arguments and, if available, the type that the result is being assigned, or returned. Finally,
// the inference algorithm tries to find the most specific type that works with all of the arguments.
public class TypeInference {
  static <T> List<T> add(List<T> list, T item1, T item2) {
      list.add(item1);
      list.add(item2);
      return list;
  }

    public static void main(String[] args) {
        List<Integer> list1 = add(new ArrayList<>(), 20,30);
        System.out.println(list1);
    }
}
