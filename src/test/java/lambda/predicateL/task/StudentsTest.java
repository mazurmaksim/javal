package lambda.predicateL.task;

import jdk.jfr.Description;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class StudentsTest {

    public List<Student> students;
    public Students student = new Students();
    @BeforeEach
    public void setUp(){
            students = new ArrayList<>();
            students.add(new Student("Ivanov", "Math", 85));
            students.add(new Student("Ivanov", "Physics", 92));
            students.add(new Student("Petrov", "Math", 88));
            students.add(new Student("Petrov", "Physics", 95));
            students.add(new Student("Sidorov", "Math", 92));
            students.add(new Student("Sidorov", "Physics", 89));
    }

    @Test
    @Description("Gel all students which has grade < 90")
    public void getStudentByPredicateLess90(){
       List<Student> filteredStudent =  student.getStudentsByGrade(a-> a.getPoints() < 90, students);

        org.assertj.core.api.Assertions.assertThat(filteredStudent).allSatisfy(st -> {
            org.assertj.core.api.Assertions.assertThat(st.getPoints()).isLessThan(90);
        });
    }

    @Test
    @Description("Gel all students which has grade < 92")
    public void getStudentByPredicateIs92(){
        List<Student> filteredStudent =  student.getStudentsByGrade(a-> a.getPoints() == 92, students);
        org.assertj.core.api.Assertions.assertThat(filteredStudent).allSatisfy(st -> {
            org.assertj.core.api.Assertions.assertThat(st.getPoints()).isEqualTo(92);
        });
    }
}