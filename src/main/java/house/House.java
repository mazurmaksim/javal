package house;

import java.util.List;

public record House(int houseNumber, List<Floor> floors) {

    @Override
    public String toString() {
        return "House{" + System.lineSeparator() +
                "houseNumber=" + houseNumber + System.lineSeparator() +
                ", floors=" + floors + System.lineSeparator() +
                '}';
    }
}
