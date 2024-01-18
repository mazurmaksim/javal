package collectioneasy;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class HowDoesWorkAddAllTest {
    HowDoesWorkAddAll addOneToOther = new HowDoesWorkAddAll();
    List<SetNotSortable.Person> list;
    List<SetNotSortable.Person> anotherList;

    @BeforeEach
    public void setUp() {
        list = new ArrayList<>();
        anotherList = new ArrayList<>();
        SetNotSortable.Person philip = new SetNotSortable.Person("Philip", 50);
        SetNotSortable.Person person2 = new SetNotSortable.Person("John", 25);
        SetNotSortable.Person person3 = new SetNotSortable.Person("Alice", 30);
        SetNotSortable.Person person4 = new SetNotSortable.Person("Bob", 45);
        SetNotSortable.Person person5 = new SetNotSortable.Person("Eva", 28);
        SetNotSortable.Person person6 = new SetNotSortable.Person("David", 35);

        list.add(philip);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        list.add(person6);

        anotherList.add(philip);
        anotherList.add(person2);
        anotherList.add(person3);
        anotherList.add(person4);
        anotherList.add(person5);
        anotherList.add(person6);
    }

    @Test
    public void adAllHowReturn() {
        List<SetNotSortable.Person> result = addOneToOther.splitLists(list, anotherList);
        org.assertj.core.api.Assertions.assertThat(result).hasSize(12);
    }

    @Test
    public void addAllSet() {
        Set<SetNotSortable.Person> result = addOneToOther.splitSets(list, anotherList);
        org.assertj.core.api.Assertions.assertThat(result).hasSize(6);
    }
}