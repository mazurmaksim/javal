package collectioneasy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HowDoesWorkAddAll {

    // At this example I want to test if same object influence when addAll
    // and another collection add duplicated objects.
    // Instead, list you should use Set
   public List<Person> splitLists(List<Person> personList, List<Person> anotherpersonList) {
       personList.addAll(anotherpersonList);
       return personList;
   }

    public Set<Person> splitSets(List<Person> personList, List<Person> anotherpersonList) {
       Set<Person> result = new HashSet<>();
       result.addAll(personList);
       result.addAll(anotherpersonList);
        return result;
    }
}
