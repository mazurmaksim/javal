package house;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNumber;
    private List<Flat> flats;

    public Floor(int floorNumber, List<Flat> flats) {
        this.floorNumber = floorNumber;
        this.flats = flats;
    }

    @Override
    public String toString() {
        return "Floor{" + System.lineSeparator() +
                "floorNumber=" + floorNumber + System.lineSeparator() +
                ", flats=" + flats + System.lineSeparator() +
                '}';
    }
}
