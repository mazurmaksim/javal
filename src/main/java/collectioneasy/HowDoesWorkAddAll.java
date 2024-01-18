package collectioneasy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HowDoesWorkAddAll {

    // At this example I want to test if same object influence when addAll
    // and another collection add duplicated objects.
    // Instead, list you should use Set
   public List<SetNotSortable.Person> splitLists(List<SetNotSortable.Person> personList, List<SetNotSortable.Person> anotherpersonList) {
       personList.addAll(anotherpersonList);
       return personList;
   }

    public Set<SetNotSortable.Person> splitSets(List<SetNotSortable.Person> personList, List<SetNotSortable.Person> anotherpersonList) {
       Set<SetNotSortable.Person> result = new HashSet<>();
       result.addAll(personList);
       result.addAll(anotherpersonList);
        return result;
    }
}
