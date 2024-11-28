package collectioneasy.comparableease.classicway;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeTest {
    private List<Employee> employees;

    @BeforeEach
    public void setUp() {
        employees = new ArrayList<>();
        employees.add(new Employee(566, "Maks", 39));
        employees.add(new Employee(12, "Sam", 23));
        employees.add(new Employee(141, "Barak", 28));
    }

    @Test
    public void sortingClassicWay() {
        Collections.sort(employees);
        Assertions.assertEquals(employees.get(0).getId(), 12);
        Assertions.assertEquals(employees.get(1).getId(), 141);
        Assertions.assertEquals(employees.get(2).getId(), 566);
    }

    @Test
    public void sortingByStream() {
        List<Employee> sortedEmployee = employees.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .toList();

        Assertions.assertEquals(sortedEmployee.get(0).getAge(), 23);
        Assertions.assertEquals(sortedEmployee.get(1).getAge(), 28);
        Assertions.assertEquals(sortedEmployee.get(2).getAge(), 39);
    }
}