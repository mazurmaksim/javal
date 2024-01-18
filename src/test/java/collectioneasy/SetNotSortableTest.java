package collectioneasy;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.HashSet;
import java.util.Set;

class SetNotSortableTest {
    SetNotSortable setNotSortable = new SetNotSortable();

    @Test()
    @DisplayName("Impossible sort set")
    public void testSortedSet() {
        Set<SetNotSortable.Person> persons = new HashSet<>();
        SetNotSortable.Person philip = new SetNotSortable.Person("Philip", 50);
        persons.add(philip);
        SetNotSortable.Person carl = new SetNotSortable.Person("Carl", 55);
        persons.add(carl);
        SetNotSortable.Person jack = new SetNotSortable.Person("Jack", 16);
        persons.add(jack);
        Set<SetNotSortable.Person> result = setNotSortable.sortingSet(persons);
        Assertions.assertThat(result).containsExactly(jack, philip, carl);
    }
}