package collectioneasy.comparableease.classicway;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee actualEmp) {
        if(this.id == actualEmp.id) {
            return 0;
        }
        if(this.age < actualEmp.age) {
            return -1;
        } else {
            return 1;
        }
    }
}
