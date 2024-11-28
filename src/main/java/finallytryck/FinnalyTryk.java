package finallytryck;

import java.io.File;
import java.io.IOException;

public class FinnalyTryk {
    public static void main(String[] args) {
        System.out.println(doFile());
    }

    public static String doFile() {
        File f = new File("./1.xtx");
        try {
            f.createNewFile();
        } finally {
            return f.toString();
        }
    }
}
