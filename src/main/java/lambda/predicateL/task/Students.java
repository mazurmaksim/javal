package lambda.predicateL.task;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Students {

    public List<Student> getStudentsByGrade(Predicate<Student> function, List<Student> students) {
           return students.stream()
                   .filter(function)
                   .collect(Collectors.toList());
    }
}
