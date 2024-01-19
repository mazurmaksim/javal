package collectioneasy;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

class SetNotSortableTest {
   public SetNotSortable setNotSortable = new SetNotSortable();
    private Set<Person> persons;
    private Person philip;
    private Person carl;
    private Person jack;

    @BeforeEach
    public void setUp() {
        persons = new HashSet<>();
        philip = new Person("Philip", 50);
        persons.add(philip);
        carl = new Person("Carl", 55);
        persons.add(carl);
        jack = new Person("Jack", 16);
        persons.add(jack);
    }

    @Test()
    @DisplayName("Impossible sort set")
    public void testSortedSetFailResult() {
        Set<Person> result = setNotSortable.sortingSet(persons);
        Assertions.assertThat(result).isNotEmpty();
    }

    @Test
    public void shouldBeSortedSet() {
        Set<Person> result = setNotSortable.sortingSet(persons);
        HashSet<Person> resultList = result.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toCollection(LinkedHashSet::new));
        Assertions.assertThat(resultList).containsExactly(jack, philip, carl);
    }

    @Test
    public void sortSetByTreeSetCustomComparator() {
        Comparator<Person> comparator = new MyComparatorImpl();
        SortedSet<Person> sortedPersonsByCustomComparator = new TreeSet<>(comparator);
        sortedPersonsByCustomComparator.addAll(persons);
        Assertions.assertThat(sortedPersonsByCustomComparator).containsExactly(jack, philip, carl);
    }
}