package lambda.functionalinterface.practice;

import lambda.functionalinterface.Name;

public class NameP {
    public static void main(String[] args) {
        Name name = ()-> System.out.println("My Name");
        name.myName();
    }
}
