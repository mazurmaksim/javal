package collectioneasy;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class HowDoesWorkAddAllTest {
    HowDoesWorkAddAll addOneToOther = new HowDoesWorkAddAll();
    List<Person> list;
    List<Person> anotherList;

    @BeforeEach
    public void setUp() {
        list = new ArrayList<>();
        anotherList = new ArrayList<>();
        Person philip = new Person("Philip", 50);
        Person person2 = new Person("John", 25);
        Person person3 = new Person("Alice", 30);
        Person person4 = new Person("Bob", 45);
        Person person5 = new Person("Eva", 28);
        Person person6 = new Person("David", 35);

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
        List<Person> result = addOneToOther.splitLists(list, anotherList);
        org.assertj.core.api.Assertions.assertThat(result).hasSize(12);
    }

    @Test
    public void addAllSet() {
        Set<Person> result = addOneToOther.splitSets(list, anotherList);
        org.assertj.core.api.Assertions.assertThat(result).hasSize(6);
    }
}