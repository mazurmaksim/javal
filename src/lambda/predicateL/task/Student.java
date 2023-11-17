package lambda.predicateL.task;

//        Suppose you have a database of students with information about their grades in different subjects. Write a query
//        using predicates to find students who have received at least one grade above 90 points.
//
//        The database is represented as follows:
//
//        prolog
//
//        student('Ivanov', 'Math', 85).
//        student('Ivanov', 'Physics', 92).
//        student('Petrov', 'Math', 88).
//        student('Petrov', 'Physics', 95).
//        student('Sidorov', 'Math', 92).
//        student('Sidorov', 'Physics', 89).
//
//        Write a query that returns a list of students who have received a grade above 90 points in at least one subject.
public class Student {
    private String lastName;
    private String subject;
    private int points;

    public Student(String lastName, String subject, int points) {
        this.lastName = lastName;
        this.subject = subject;
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", subject='" + subject + '\'' +
                ", points=" + points +
                '}';
    }
}
