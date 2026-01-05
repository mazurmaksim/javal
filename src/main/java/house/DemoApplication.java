package house;

import java.util.HashSet;
import java.util.Set;

public class DemoApplication {

    private int a;
    public static int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1, 5, 7, 8, 10, 3, 12 -> {
                return 31;
            }
            case 2 -> {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    return 29;
                }
                return 28;
            }
            case 4, 6, 9, 11 -> {
                return 30;
            }
            default -> throw new IllegalArgumentException("Invalid month number");
        }
    }


    public static String dayName(int day) {
        if (day < 1 || day > 31) {
            throw new IllegalArgumentException("Day number out of range: 1-7");
        }
        return switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalArgumentException("Invalid day number: " + day);
        };
    }

    public static int calculate(int a, int b, char op) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                yield a / b;
            }
            case '%' -> a % b;
            default -> throw new IllegalArgumentException("Invalid operation: " + op);
        };
    }

    public static String fileType(String fileName) {
        if (fileName == null || fileName.isEmpty()) {
            throw new IllegalArgumentException("file name is null or empty");
        }
        return switch (fileName) {
            case "jpg", "png", "gif" -> "Image";
            case "txt", "md" -> "Text";
            case "json", "xml", "yaml" -> "Data";
            case "jar", "class" -> "Bytecode";
            default -> "Unknown";
        };
    }

    public static String reverse(String text) {
//        validate(text);
        StringBuilder result = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            result.append(ch);
        }
        return result.toString();
    }

//    private static void validate(String text) {
//        validateAndSplitByPunctuation(text);
//    }

    public static boolean isPalindrome(String text) {
        text = normalizeAndValidate(text);
        StringBuilder result = new StringBuilder(text.length());
        for (int i = text.length() - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                result.append(ch);
            }
        }
        return result.toString().equals(text);
    }

    private static String normalizeAndValidate(String text) {
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("Text is null or empty");
        }
        StringBuilder result = new StringBuilder();
        String[] tmp = text.toLowerCase().split(" ");
        for (String s : tmp) {
            result.append(s);
        }
        return result.toString();
    }

    public static int[] filterEven(int[] arr){
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
        }

        int[] tempResult = new int[arr.length];
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                tempResult[count] = j;
                count++;
            }
        }

        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = tempResult[i];
        }
        return result;
    }

    public static Set<String> uniqueWords(String text){
        Set<String> words = new HashSet<>();

        return words;
    }


    public static void main(String[] args) {
        System.out.println(DemoApplication.class);
        DemoApplication demoApplication = new DemoApplication();
        System.out.println(demoApplication.getClass());
    }


}
