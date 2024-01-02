package generics.practice.copylist;

import java.util.List;

/* implement copy method (it is present in Collections by the way) that's able to copy the items from a source list into
        a destination list. Use wildcards with the appropriate bounds!
        Hint: you have to copy the items from one of the lists into another
        list (so there are read and write operations accordingly). */
public class CopyList {

    public <T> void copy(List<? extends T> source, List<? super T> destination) {
        for (T obj: source) {
            destination.add(obj);
        }
    }
    public static void main(String[] args) {

    }
}
