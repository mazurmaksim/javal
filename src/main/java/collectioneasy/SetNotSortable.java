package collectioneasy;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

public class SetNotSortable {
    public Set<Person> sortingSet(Set<Person> personSet) {
        return personSet.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toSet());
    }
}