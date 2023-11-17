package lambda.functionalinterface;

public class FunctionalGenericsDemo {
    public static void main(String[] args) {
        FunctionalGeneric<String, String> fun = s-> s.substring(1,5);
        System.out.println(fun.execute("Hello world"));
    }
}
