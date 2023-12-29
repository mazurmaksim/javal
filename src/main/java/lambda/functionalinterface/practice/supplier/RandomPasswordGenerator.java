package main.java.lambda.functionalinterface.practice.supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

//Use a Supplier to generate a random password of a specified length.
public class RandomPasswordGenerator {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            PasswordGenerator passwordGenerator = new PasswordGenerator();
            return passwordGenerator.generatePass(15);
        };
        System.out.println(supplier.get());
    }

}

class PasswordGenerator {
    private final List<Character> CHARACTERS = List.of(
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
            '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            '!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '_', '+', '='
    );
    private Integer length;

    public String generatePass(Integer length) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            password.append(CHARACTERS.get(new Random().nextInt(0, CHARACTERS.size() - 1)));
        }
        return password.toString();
    }
}