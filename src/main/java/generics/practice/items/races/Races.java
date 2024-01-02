package generics.practice.items.races;

public class Races {
    Long id;
    String race;

    public Races(Long id, String race) {
        this.id = id;
        this.race = race;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }
}
