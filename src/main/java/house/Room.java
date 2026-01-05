package house;

public class Room {
    private boolean checkpoint;

    public Room(boolean checkpoint) {
        this.checkpoint = checkpoint;
    }

    @Override
    public String toString() {
        return "Room{" + System.lineSeparator() +
                "checkpoint=" + checkpoint + System.lineSeparator() +
                '}';
    }
}
