package lambda.functionalinterface;

public class StringLengthPractice {
    public static void main(String[] args) {
        LengthOfString length = String::length;
        int len = length.length("Abc");
        System.out.println(len);
    }
}
