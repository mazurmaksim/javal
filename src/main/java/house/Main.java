package house;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(true);
        System.out.println(room);
        List<Floor> floors = List.of(
                new Floor(1,
                        List.of(new Flat(12, List.of(
                                room))
                        )),
                new Floor(2,
                        List.of(new Flat(14, List.of(
                                room))
                        ))
        );
        House house = new House(10, floors);
        System.out.println(house);
    }
}

