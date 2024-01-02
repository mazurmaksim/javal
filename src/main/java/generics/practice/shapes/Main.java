package generics.practice.shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static <T extends Shape> void drawAll(List<T> shapes){
        for (T shape: shapes) {
            shape.draw();
        }
    }

    public static void main(String[] args) {
        drawAll(List.of(new Rectangle()));
    }
}
