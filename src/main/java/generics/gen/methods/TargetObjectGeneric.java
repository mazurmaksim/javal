package generics.gen.methods;

import java.util.List;

public class TargetObjectGeneric {
    //     create a generic method that takes a list of any type and a target element.
    //     It returns the index of the first occurrence of the target element in the list.
    //     Return -1 if the target element cannot be found.
    public <T> int getTargetFromList(List<T> list, T t) {
        return list.indexOf(t);
    }
}
