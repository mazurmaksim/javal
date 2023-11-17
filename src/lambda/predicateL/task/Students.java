package lambda.predicateL.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Students {

    private static final List<Student> students;

    static {
        students = new ArrayList<>();
        students.add(new Student("Ivanov", "Math", 85));
        students.add(new Student("Ivanov", "Physics", 92));
        students.add(new Student("Petrov", "Math", 88));
        students.add(new Student("Petrov", "Physics", 95));
        students.add(new Student("Sidorov", "Math", 92));
        students.add(new Student("Sidorov", "Physics", 89));
    }

    public static List<Student> getStudentsByGrade(Predicate<Student> function) {
           return students.stream()
                   .filter(function)
                   .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getStudentsByGrade(a->a.getPoints() < 90));
    }
}
