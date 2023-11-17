package lambda.functionalinterface.practice;

import lambda.functionalinterface.MathOperation;

public class OperationP {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> System.out.println(a+b);
        MathOperation multiply = (a, b) -> System.out.println(a*b);
        add.operation(10,15);
        multiply.operation(58,78);
    }
}
