package lambda.functionalinterface.practice.predicate.citizens;

//    Filtering objects using a complex condition:
//    Create a class with two fields (e.g., birth year and country) and use a Predicate
//    to filter objects that satisfy a complex condition (e.g., age over 18 and country is "Ukraine").
public class Citizen {
    String name;
    Integer age;

    public Citizen(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void shouldThrowException() {
        throw new RuntimeException("Age can’t be more than 90");
    }
    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
