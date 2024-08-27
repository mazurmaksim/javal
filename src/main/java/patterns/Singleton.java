package patterns;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        if (instance == null) {
            instance = new Singleton();
        }
    }

    public static Singleton getInstance() {
        return instance;
    }
}
