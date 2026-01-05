package house;

import java.util.List;

public class Flat {
    private int flatNumber;
    private List<Room> rooms;

    public Flat(int flatNumber, List<Room> rooms) {
        this.flatNumber = flatNumber;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "Flat{" + System.lineSeparator() +
                "flatNumber=" + flatNumber + System.lineSeparator() +
                ", rooms=" + rooms + System.lineSeparator() +
                '}';
    }
}
